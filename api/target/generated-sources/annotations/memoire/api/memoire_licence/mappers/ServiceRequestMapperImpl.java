package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.ServiceRequestDTO;
import memoire.api.memoire_licence.entities.Categorie;
import memoire.api.memoire_licence.entities.Service;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-23T15:51:28+0000",
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

        service.setCategorie( serviceRequestDTOToCategorie( serviceRequestDTO ) );
        service.setNom( serviceRequestDTO.getNom() );
        service.setDescription( serviceRequestDTO.getDescription() );

        return service;
    }

    protected Categorie serviceRequestDTOToCategorie(ServiceRequestDTO serviceRequestDTO) {
        if ( serviceRequestDTO == null ) {
            return null;
        }

        Categorie categorie = new Categorie();

        if ( serviceRequestDTO.getIdcategorie() != null ) {
            categorie.setIdcategorie( serviceRequestDTO.getIdcategorie() );
        }

        return categorie;
    }
}
