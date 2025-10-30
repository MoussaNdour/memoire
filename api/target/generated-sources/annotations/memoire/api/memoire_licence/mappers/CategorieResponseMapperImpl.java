package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.response.CategorieResponseDTO;
import memoire.api.memoire_licence.entities.Categorie;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-30T16:24:24+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class CategorieResponseMapperImpl implements CategorieResponseMapper {

    @Override
    public CategorieResponseDTO toDTO(Categorie categorie) {
        if ( categorie == null ) {
            return null;
        }

        CategorieResponseDTO categorieResponseDTO = new CategorieResponseDTO();

        categorieResponseDTO.setIdcategorie( categorie.getIdcategorie() );
        categorieResponseDTO.setLibelle( categorie.getLibelle() );

        return categorieResponseDTO;
    }
}
