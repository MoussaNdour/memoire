package memoire.api.memoire_licence.services.classes;

import jakarta.transaction.Transactional;
import memoire.api.memoire_licence.dto.request.ServiceRequestDTO;
import memoire.api.memoire_licence.dto.response.ServiceResponseDTO;
import memoire.api.memoire_licence.mappers.ServiceRequestMapper;
import memoire.api.memoire_licence.mappers.ServiceResponseMapper;
import memoire.api.memoire_licence.repositories.ServiceRepository;
import memoire.api.memoire_licence.services.interfaces.ServiceForServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ServiceForServiceEntity implements ServiceForServiceInterface {

    @Autowired
    ServiceRepository repos;

    @Autowired
    ServiceRequestMapper requestMapper;

    @Autowired
    ServiceResponseMapper responseMapper;

    @Override
    public boolean create(ServiceRequestDTO serviceDTO) {
        memoire.api.memoire_licence.entities.Service service =requestMapper.toEntity(serviceDTO);
        repos.save(service);

        return true;
    }

    @Transactional
    @Override
    public boolean delete(int id) {
        repos.deleteById(id);
        return true;
    }

    @Override
    public List<ServiceResponseDTO> findAll() {
        ArrayList<ServiceResponseDTO> services=new ArrayList<>();
        Iterator i=repos.findAll().iterator();

        while(i.hasNext()){
            services.add(responseMapper.toDTO((memoire.api.memoire_licence.entities.Service)i.next()));
        }

        return services;
    }

    @Override
    public ServiceResponseDTO findById(int id) {
        memoire.api.memoire_licence.entities.Service service=repos.findById(id).orElse(null);
        if(service!=null){
            ServiceResponseDTO responseDTO=responseMapper.toDTO(service);

            return responseDTO;
        }
        else{
            return null;
        }
    }

    @Override
    public boolean update(int id, ServiceRequestDTO serviceDTO) {
        memoire.api.memoire_licence.entities.Service service=repos.findById(id).orElse(null);
        if(service!=null){
            memoire.api.memoire_licence.entities.Service updated=requestMapper.toEntity(serviceDTO);

            updated.setIdservice(service.getIdservice());
            repos.save(updated);

            return true;
        }
        else{
            return false;
        }

    }
}
