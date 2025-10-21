package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.response.ServiceResponseDTO;
import memoire.api.memoire_licence.entities.Service;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-20T17:56:11+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class ServiceResponseMapperImpl implements ServiceResponseMapper {

    @Override
    public ServiceResponseDTO toDTO(Service service) {
        if ( service == null ) {
            return null;
        }

        ServiceResponseDTO serviceResponseDTO = new ServiceResponseDTO();

        serviceResponseDTO.setIdservice( service.getIdservice() );
        serviceResponseDTO.setNom( service.getNom() );
        serviceResponseDTO.setDescription( service.getDescription() );
        serviceResponseDTO.setCategorie( service.getCategorie() );

        return serviceResponseDTO;
    }
}
