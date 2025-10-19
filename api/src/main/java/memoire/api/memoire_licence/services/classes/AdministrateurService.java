package memoire.api.memoire_licence.services.classes;

import jakarta.transaction.Transactional;
import memoire.api.memoire_licence.dto.request.AdministrateurRequestDTO;
import memoire.api.memoire_licence.dto.response.AdministrateurResponseDTO;
import memoire.api.memoire_licence.entities.Administrateur;
import memoire.api.memoire_licence.entities.Utilisateur;
import memoire.api.memoire_licence.mappers.AdministrateurRequestMapper;
import memoire.api.memoire_licence.mappers.AdministrateurResponseMapper;
import memoire.api.memoire_licence.repositories.AdministrateurRepository;
import memoire.api.memoire_licence.repositories.UtilisateurRepository;
import memoire.api.memoire_licence.services.interfaces.AdministrateurServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class AdministrateurService implements AdministrateurServiceInterface {

    @Autowired
    AdministrateurRequestMapper requestMapper;

    @Autowired
    AdministrateurResponseMapper responseMapper;

    @Autowired
    AdministrateurRepository repos;

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Autowired
    PasswordEncoder encoder;

    @Override
    public List<AdministrateurResponseDTO> findAll() {
        ArrayList<AdministrateurResponseDTO> admins=new ArrayList<>();
        Iterator i=repos.findAll().iterator();
        while(i.hasNext()){
            admins.add(responseMapper.toDTO((Administrateur) i.next()));
        }

        return admins;
    }

    @Override
    public AdministrateurResponseDTO findById(int idadmin) {
        Administrateur admin=repos.findById(idadmin).orElse(null);
        if(admin==null)
            return null;
        else{
            return responseMapper.toDTO(admin);
        }
    }

    @Override
    public boolean save(AdministrateurRequestDTO administrateurDTO) {
        Utilisateur test=utilisateurRepository.findByEmail(administrateurDTO.getEmail()).orElse(null);

        if(test==null){
            Administrateur admin=requestMapper.toEntity(administrateurDTO);

            Utilisateur user=admin.getUtilisateur();
            user.setRole("ADMIN");
            user.setMotdepasse(encoder.encode(user.getMotdepasse()));

            utilisateurRepository.save(user);
            repos.save(admin);

            return true;
        }
        else
            return false;


    }

    @Override
    public boolean update(int id,AdministrateurRequestDTO administrateurDTO) {
        Administrateur admin=repos.findById(id).orElse(null);
        if(admin!=null){

            Administrateur updated=requestMapper.toEntity(administrateurDTO);
            updated.setIdadmin(id);

            Utilisateur utilisateur=utilisateurRepository.findByEmail(updated.getUtilisateur().getEmail()).orElse(null);
            if(utilisateur!=null){
                return false;
            }
            else{
                Utilisateur userUpdated=updated.getUtilisateur();
                userUpdated.setIdutilisateur(admin.getUtilisateur().getIdutilisateur());
                updated.setIdadmin(admin.getIdadmin());
                userUpdated.setMotdepasse(encoder.encode(updated.getUtilisateur().getPassword()));

                utilisateurRepository.save(userUpdated);

                repos.save(updated);

                return true;
            }
        }
        else{
            return false;
        }
    }

    @Transactional
    @Override
    public boolean deleteById(int idadmin) {
        repos.deleteById(idadmin);

        return true;
    }
}
