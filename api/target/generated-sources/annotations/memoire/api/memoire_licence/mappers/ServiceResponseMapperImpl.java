package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.response.ServiceResponseDTO;
import memoire.api.memoire_licence.entities.Categorie;
import memoire.api.memoire_licence.entities.Service;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-21T13:40:46+0000",
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

        serviceResponseDTO.setCategorie( serviceCategorieLibelle( service ) );
        serviceResponseDTO.setIdservice( service.getIdservice() );
        serviceResponseDTO.setNom( service.getNom() );
        serviceResponseDTO.setDescription( service.getDescription() );

        return serviceResponseDTO;
    }

    private String serviceCategorieLibelle(Service service) {
        Categorie categorie = service.getCategorie();
        if ( categorie == null ) {
            return null;
        }
        return categorie.getLibelle();
    }
}
