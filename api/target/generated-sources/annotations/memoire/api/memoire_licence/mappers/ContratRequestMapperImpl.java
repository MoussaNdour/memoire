package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.ContratRequestDTO;
import memoire.api.memoire_licence.entities.Contrat;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-22T17:05:12+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class ContratRequestMapperImpl implements ContratRequestMapper {

    @Override
    public Contrat toEntity(ContratRequestDTO contratDTO) {
        if ( contratDTO == null ) {
            return null;
        }

        Contrat contrat = new Contrat();

        contrat.setHoraires( contratDTO.getHoraires() );
        contrat.setJours( contratDTO.getJours() );
        contrat.setMontantSalaire( contratDTO.getMontantSalaire() );
        if ( contratDTO.getDuree() != null ) {
            contrat.setDuree( contratDTO.getDuree() );
        }

        return contrat;
    }

    @Override
    public ContratRequestDTO toDTO(Contrat contrat) {
        if ( contrat == null ) {
            return null;
        }

        ContratRequestDTO contratRequestDTO = new ContratRequestDTO();

        contratRequestDTO.setHoraires( contrat.getHoraires() );
        contratRequestDTO.setMontantSalaire( contrat.getMontantSalaire() );
        contratRequestDTO.setJours( contrat.getJours() );
        contratRequestDTO.setDuree( contrat.getDuree() );

        return contratRequestDTO;
    }
}
