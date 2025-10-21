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
    date = "2025-10-20T17:56:10+0000",
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
        demandeservice.setDetailsdemande( dto.getDetailsdemande() );

        return demandeservice;
    }

    @Override
    public DemandeServiceRequestDTO toDTO(Demandeservice demande) {
        if ( demande == null ) {
            return null;
        }

        DemandeServiceRequestDTO demandeServiceRequestDTO = new DemandeServiceRequestDTO();

        demandeServiceRequestDTO.setIdclient( demandeClientIdclient( demande ) );
        demandeServiceRequestDTO.setIdprestataire( demandePrestataireIdprestataire( demande ) );
        demandeServiceRequestDTO.setIdservice( demandeServiceIdservice( demande ) );
        demandeServiceRequestDTO.setIdcontrat( demandeContratIdcontrat( demande ) );
        demandeServiceRequestDTO.setDetailsdemande( demande.getDetailsdemande() );

        return demandeServiceRequestDTO;
    }

    protected Client demandeServiceRequestDTOToClient(DemandeServiceRequestDTO demandeServiceRequestDTO) {
        if ( demandeServiceRequestDTO == null ) {
            return null;
        }

        Client client = new Client();

        client.setIdclient( demandeServiceRequestDTO.getIdclient() );

        return client;
    }

    protected Prestataire demandeServiceRequestDTOToPrestataire(DemandeServiceRequestDTO demandeServiceRequestDTO) {
        if ( demandeServiceRequestDTO == null ) {
            return null;
        }

        Prestataire prestataire = new Prestataire();

        prestataire.setIdprestataire( demandeServiceRequestDTO.getIdprestataire() );

        return prestataire;
    }

    protected Service demandeServiceRequestDTOToService(DemandeServiceRequestDTO demandeServiceRequestDTO) {
        if ( demandeServiceRequestDTO == null ) {
            return null;
        }

        Service service = new Service();

        service.setIdservice( demandeServiceRequestDTO.getIdservice() );

        return service;
    }

    protected Contrat demandeServiceRequestDTOToContrat(DemandeServiceRequestDTO demandeServiceRequestDTO) {
        if ( demandeServiceRequestDTO == null ) {
            return null;
        }

        Contrat contrat = new Contrat();

        contrat.setIdcontrat( demandeServiceRequestDTO.getIdcontrat() );

        return contrat;
    }

    private int demandeClientIdclient(Demandeservice demandeservice) {
        Client client = demandeservice.getClient();
        if ( client == null ) {
            return 0;
        }
        return client.getIdclient();
    }

    private int demandePrestataireIdprestataire(Demandeservice demandeservice) {
        Prestataire prestataire = demandeservice.getPrestataire();
        if ( prestataire == null ) {
            return 0;
        }
        return prestataire.getIdprestataire();
    }

    private int demandeServiceIdservice(Demandeservice demandeservice) {
        Service service = demandeservice.getService();
        if ( service == null ) {
            return 0;
        }
        return service.getIdservice();
    }

    private int demandeContratIdcontrat(Demandeservice demandeservice) {
        Contrat contrat = demandeservice.getContrat();
        if ( contrat == null ) {
            return 0;
        }
        return contrat.getIdcontrat();
    }
}
