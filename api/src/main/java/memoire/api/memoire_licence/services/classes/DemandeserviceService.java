package memoire.api.memoire_licence.services.classes;

import memoire.api.memoire_licence.dto.request.DemandeServiceRequestDTO;
import memoire.api.memoire_licence.dto.response.DemandeServiceResponseDTO;
import memoire.api.memoire_licence.entities.Demandeservice;
import memoire.api.memoire_licence.mappers.DemandeServiceRequestMapper;
import memoire.api.memoire_licence.mappers.DemandeServiceResponseMapper;
import memoire.api.memoire_licence.repositories.DemandeserviceRepository;
import memoire.api.memoire_licence.services.interfaces.DemandeserviceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
public class DemandeserviceService implements DemandeserviceServiceInterface {

    @Autowired
    DemandeserviceRepository repos;

    @Autowired
    DemandeServiceRequestMapper requestMapper;

    @Autowired
    DemandeServiceResponseMapper responseMapper;

    @Override
    public boolean save(DemandeServiceRequestDTO dto) {
        repos.save(requestMapper.toEntity(dto));

        return true;
    }

    @Override
    public List<DemandeServiceResponseDTO> findAll() {
        ArrayList<DemandeServiceResponseDTO> demandes=new ArrayList<>();
        Iterator i=repos.findAll().iterator();
        while (i.hasNext()){
            demandes.add(responseMapper.toDTO((Demandeservice) i.next()));
        }

        return demandes;
    }

    @Override
    public boolean update(int id, DemandeServiceRequestDTO dto) {
        Demandeservice demande=repos.findById(id).orElse(null);

        if(demande==null){
            return false;
        }
        else{
            Demandeservice updated=new Demandeservice();
            updated=requestMapper.toEntity(dto);
            updated.setIddemande(id);

            repos.save(updated);
        }

        return true;
    }

    @Override
    public DemandeServiceResponseDTO find(int id) {
        Demandeservice demande=repos.findById(id).orElse(null);
        if(demande==null)
            return null;
        else{
            return responseMapper.toDTO(demande);
        }
    }

    @Override
    public void delete(int id) {
        repos.deleteById(id);
    }
}
