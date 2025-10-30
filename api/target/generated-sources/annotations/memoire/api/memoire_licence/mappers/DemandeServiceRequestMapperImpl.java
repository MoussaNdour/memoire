package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.DemandeServiceRequestDTO;
import memoire.api.memoire_licence.entities.Client;
import memoire.api.memoire_licence.entities.Contrat;
import memoire.api.memoire_licence.entities.Demandeservice;
import memoire.api.memoire_licence.entities.Prestataire;
import memoire.api.memoire_licence.entities.Service;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-30T16:24:25+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class DemandeServiceRequestMapperImpl implements DemandeServiceRequestMapper {

    @Override
    public Demandeservice toEntity(DemandeServiceRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Demandeservice demandeservice = new Demandeservice();

        demandeservice.setClient( demandeServiceRequestDTOToClient( dto ) );
        demandeservice.setPrestataire( demandeServiceRequestDTOToPrestataire( dto ) );
        demandeservice.setService( demandeServiceRequestDTOToService( dto ) );
        demandeservice.setContrat( demandeServiceRequestDTOToContrat( dto ) );
        demandeservice.setDaterendezvous( dto.getDaterendezvous() );
        demandeservice.setDetailsdemande( dto.getDetailsdemande() );

        return demandeservice;
    }

    protected Client demandeServiceRequestDTOToClient(DemandeServiceRequestDTO demandeServiceRequestDTO) {
        if ( demandeServiceRequestDTO == null ) {
            return null;
        }

        Client client = new Client();

        if ( demandeServiceRequestDTO.getIdclient() != null ) {
            client.setIdclient( demandeServiceRequestDTO.getIdclient() );
        }

        return client;
    }

    protected Prestataire demandeServiceRequestDTOToPrestataire(DemandeServiceRequestDTO demandeServiceRequestDTO) {
        if ( demandeServiceRequestDTO == null ) {
            return null;
        }

        Prestataire prestataire = new Prestataire();

        if ( demandeServiceRequestDTO.getIdprestataire() != null ) {
            prestataire.setIdprestataire( demandeServiceRequestDTO.getIdprestataire() );
        }

        return prestataire;
    }

    protected Service demandeServiceRequestDTOToService(DemandeServiceRequestDTO demandeServiceRequestDTO) {
        if ( demandeServiceRequestDTO == null ) {
            return null;
        }

        Service service = new Service();

        if ( demandeServiceRequestDTO.getIdservice() != null ) {
            service.setIdservice( demandeServiceRequestDTO.getIdservice() );
        }

        return service;
    }

    protected Contrat demandeServiceRequestDTOToContrat(DemandeServiceRequestDTO demandeServiceRequestDTO) {
        if ( demandeServiceRequestDTO == null ) {
            return null;
        }

        Contrat contrat = new Contrat();

        if ( demandeServiceRequestDTO.getIdcontrat() != null ) {
            contrat.setIdcontrat( demandeServiceRequestDTO.getIdcontrat() );
        }

        return contrat;
    }
}
