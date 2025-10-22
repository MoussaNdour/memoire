package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.response.ContratResponseDTO;
import memoire.api.memoire_licence.entities.Contrat;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-22T17:05:14+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class ContratResponseMapperImpl implements ContratResponseMapper {

    @Override
    public ContratResponseDTO toDTO(Contrat contrat) {
        if ( contrat == null ) {
            return null;
        }

        ContratResponseDTO contratResponseDTO = new ContratResponseDTO();

        contratResponseDTO.setHoraires( contrat.getHoraires() );
        contratResponseDTO.setJours( contrat.getJours() );
        contratResponseDTO.setMontantSalaire( contrat.getMontantSalaire() );
        contratResponseDTO.setDuree( contrat.getDuree() );
        contratResponseDTO.setIdcontrat( contrat.getIdcontrat() );
        contratResponseDTO.setType_contrat( contrat.getType_contrat() );
        contratResponseDTO.setStatut( contrat.getStatut() );

        return contratResponseDTO;
    }
}
