package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.CategorieRequestDTO;
import memoire.api.memoire_licence.entities.Categorie;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-23T14:37:51+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class CategorieRequestMapperImpl implements CategorieRequestMapper {

    @Override
    public Categorie toEntity(CategorieRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Categorie categorie = new Categorie();

        categorie.setLibelle( dto.getLibelle() );

        return categorie;
    }
}
