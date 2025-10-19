package memoire.api.memoire_licence.services.classes;

import jakarta.transaction.Transactional;
import memoire.api.memoire_licence.dto.request.PrestataireRequestDTO;
import memoire.api.memoire_licence.dto.response.PrestataireResponseDTO;
import memoire.api.memoire_licence.entities.Prestataire;
import memoire.api.memoire_licence.entities.Utilisateur;
import memoire.api.memoire_licence.mappers.PrestataireRequestMapper;
import memoire.api.memoire_licence.mappers.PrestataireResponseMapper;
import memoire.api.memoire_licence.repositories.PrestataireRepository;
import memoire.api.memoire_licence.repositories.UtilisateurRepository;
import memoire.api.memoire_licence.services.interfaces.PrestataireServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PrestataireService implements PrestataireServiceInterface {

    @Autowired
    PrestataireRepository repos;

    @Autowired
    PrestataireRequestMapper requestMapper;

    @Autowired
    PrestataireResponseMapper responseMapper;

    @Autowired
    UtilisateurRepository utilisateurRepos;

    @Autowired
    PasswordEncoder encoder;

    @Override
    public List<PrestataireResponseDTO> findAll() {
        ArrayList<PrestataireResponseDTO> prestataires=new ArrayList<>();
        Iterator i=repos.findAll().iterator();
        while (i.hasNext()){
            prestataires.add(responseMapper.toDTO((Prestataire) i.next()));
        }

        return prestataires;
    }

    @Override
    public PrestataireResponseDTO findById(int idpresta) {
        Prestataire presta=repos.findById(idpresta).orElse(null);
        if(presta==null){
            return null;
        }
        else
            return responseMapper.toDTO(presta);

    }

    @Override
    public boolean create(PrestataireRequestDTO prestataireDTO) {

        Utilisateur test=utilisateurRepos.findByEmail(prestataireDTO.getEmail()).orElse(null);
        if(test==null){
            Prestataire prestataire=requestMapper.toEntity(prestataireDTO);
            Utilisateur user=prestataire.getUtilisateur();
            user.setRole("PRESTATAIRE");
            user.setMotdepasse(encoder.encode(user.getMotdepasse()));
            utilisateurRepos.save(user);
            repos.save(prestataire);
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public boolean update(int idpresta, PrestataireRequestDTO prestataireDTO) {
        Prestataire test=repos.findById(idpresta).orElse(null);
        if(test==null){
            return false;
        }
        else{

            Prestataire prestataire=requestMapper.toEntity(prestataireDTO);
            prestataire.setIdprestataire(idpresta);

            Utilisateur utilisateur=utilisateurRepos.findByEmail(prestataire.getUtilisateur().getEmail()).orElse(null);
            if(utilisateur!=null)
            {
                return false;
            }
            else{
                Utilisateur user=prestataire.getUtilisateur();
                user.setIdutilisateur(prestataire.getUtilisateur().getIdutilisateur());
                user.setMotdepasse(encoder.encode(prestataire.getUtilisateur().getMotdepasse()));
                user.setRole("PRESTATAIRE");

                utilisateurRepos.save(user);
                repos.save(prestataire);
                return true;
            }
        }
    }

    @Transactional
    @Override
    public boolean deleteById(int idpresta) {
        repos.deleteById(idpresta);
        return true;
    }
}
