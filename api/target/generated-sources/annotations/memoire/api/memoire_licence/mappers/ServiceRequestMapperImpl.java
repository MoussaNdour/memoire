package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.ServiceRequestDTO;
import memoire.api.memoire_licence.entities.Service;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-20T17:56:10+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class ServiceRequestMapperImpl implements ServiceRequestMapper {

    @Override
    public Service toEntity(ServiceRequestDTO serviceRequestDTO) {
        if ( serviceRequestDTO == null ) {
            return null;
        }

        Service service = new Service();

        service.setNom( serviceRequestDTO.getNom() );
        service.setDescription( serviceRequestDTO.getDescription() );
        service.setCategorie( serviceRequestDTO.getCategorie() );

        return service;
    }

    @Override
    public ServiceRequestDTO toDTO(Service service) {
        if ( service == null ) {
            return null;
        }

        ServiceRequestDTO serviceRequestDTO = new ServiceRequestDTO();

        serviceRequestDTO.setNom( service.getNom() );
        serviceRequestDTO.setDescription( service.getDescription() );
        serviceRequestDTO.setCategorie( service.getCategorie() );

        return serviceRequestDTO;
    }
}
