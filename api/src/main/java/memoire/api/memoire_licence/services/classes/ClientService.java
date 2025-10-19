package memoire.api.memoire_licence.services.classes;


import jakarta.transaction.Transactional;
import memoire.api.memoire_licence.dto.request.ClientRequestDTO;
import memoire.api.memoire_licence.dto.response.ClientResponseDTO;
import memoire.api.memoire_licence.entities.Client;
import memoire.api.memoire_licence.entities.Utilisateur;
import memoire.api.memoire_licence.mappers.ClientRequestMapper;
import memoire.api.memoire_licence.mappers.ClientResponseMapper;
import memoire.api.memoire_licence.repositories.ClientRepository;
import memoire.api.memoire_licence.repositories.UtilisateurRepository;
import memoire.api.memoire_licence.services.interfaces.ClientServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ClientService implements ClientServiceInterface {

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    ClientRepository repos;

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Autowired
    ClientRequestMapper requestMapper;

    @Autowired
    ClientResponseMapper responseMapper;


    @Override
    public List<ClientResponseDTO> findAll() {
        ArrayList<ClientResponseDTO> clients=new ArrayList<>();
        Iterator i=repos.findAll().iterator();
        while(i.hasNext()){
            clients.add(responseMapper.toDTO((Client)i.next()));
        }

        return clients;
    }

    @Override
    public ClientResponseDTO findById(int idclient) {
        Client client=repos.findById(idclient).orElse(null);
        if(client!=null){
            return responseMapper.toDTO(client);
        }
        else{
            return null;
        }

    }

    @Override
    public boolean create(ClientRequestDTO clientDTO) {
        Utilisateur test=utilisateurRepository.findByEmail(clientDTO.getEmail()).orElse(null);

        if(test==null){
            Client client=requestMapper.toEntity(clientDTO);
            Utilisateur user=client.getUtilisateur();
            user.setRole("CLIENT");
            user.setMotdepasse(encoder.encode(user.getMotdepasse()));
            utilisateurRepository.save(user);
            repos.save(client);

            return true;
        }
        else
            return false;
    }

    @Override
    public boolean update(int idclient, ClientRequestDTO clientDTO) {
        Client test=repos.findById(idclient).orElse(null);

        if(test==null){
            return false;
        }
        else{

            Client updated=requestMapper.toEntity(clientDTO);
            updated.setIdclient(idclient);

            Utilisateur utilisateur=utilisateurRepository.findByEmail(updated.getUtilisateur().getEmail()).orElse(null);
            if(utilisateur!=null){
                return false;
            }
            else{
                Utilisateur userUpdated=updated.getUtilisateur();
                userUpdated.setMotdepasse(encoder.encode(updated.getUtilisateur().getMotdepasse()));
                userUpdated.setRole("CLIENT");
                userUpdated.setIdutilisateur(test.getUtilisateur().getIdutilisateur());


                utilisateurRepository.save(userUpdated);
                repos.save(updated);

                return true;
            }
        }
    }

    @Transactional
    @Override
    public boolean deleteById(int idclient) {
        repos.deleteById(idclient);
        return true;
    }
}
