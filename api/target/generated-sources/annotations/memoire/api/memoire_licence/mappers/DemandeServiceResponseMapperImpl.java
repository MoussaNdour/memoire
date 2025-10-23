package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.response.DemandeServiceResponseDTO;
import memoire.api.memoire_licence.entities.Client;
import memoire.api.memoire_licence.entities.Contrat;
import memoire.api.memoire_licence.entities.Demandeservice;
import memoire.api.memoire_licence.entities.Paiement;
import memoire.api.memoire_licence.entities.Prestataire;
import memoire.api.memoire_licence.entities.Service;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-23T15:51:30+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class DemandeServiceResponseMapperImpl implements DemandeServiceResponseMapper {

    @Override
    public DemandeServiceResponseDTO toDTO(Demandeservice demande) {
        if ( demande == null ) {
            return null;
        }

        DemandeServiceResponseDTO demandeServiceResponseDTO = new DemandeServiceResponseDTO();

        demandeServiceResponseDTO.setNomService( demandeServiceNom( demande ) );
        demandeServiceResponseDTO.setPrenomClient( demandeClientUtilisateurPrenom( demande ) );
        demandeServiceResponseDTO.setNomClient( demandeClientUtilisateurNom( demande ) );
        demandeServiceResponseDTO.setStatutpaiement( demandePaiementStatutpaiement( demande ) );
        demandeServiceResponseDTO.setPrenomPrestataire( demandePrestataireUtilisateurPrenom( demande ) );
        demandeServiceResponseDTO.setNomPrestataire( demandePrestataireUtilisateurNom( demande ) );
        demandeServiceResponseDTO.setDuree( demandeContratDuree( demande ) );
        demandeServiceResponseDTO.setIddemande( demande.getIddemande() );
        demandeServiceResponseDTO.setStatut( demande.getStatut() );
        demandeServiceResponseDTO.setDaterendezvous( demande.getDaterendezvous() );

        return demandeServiceResponseDTO;
    }

    private String demandeServiceNom(Demandeservice demandeservice) {
        Service service = demandeservice.getService();
        if ( service == null ) {
            return null;
        }
        return service.getNom();
    }

    private String demandeClientUtilisateurPrenom(Demandeservice demandeservice) {
        Client client = demandeservice.getClient();
        if ( client == null ) {
            return null;
        }
        Utilisateur utilisateur = client.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getPrenom();
    }

    private String demandeClientUtilisateurNom(Demandeservice demandeservice) {
        Client client = demandeservice.getClient();
        if ( client == null ) {
            return null;
        }
        Utilisateur utilisateur = client.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getNom();
    }

    private String demandePaiementStatutpaiement(Demandeservice demandeservice) {
        Paiement paiement = demandeservice.getPaiement();
        if ( paiement == null ) {
            return null;
        }
        return paiement.getStatutpaiement();
    }

    private String demandePrestataireUtilisateurPrenom(Demandeservice demandeservice) {
        Prestataire prestataire = demandeservice.getPrestataire();
        if ( prestataire == null ) {
            return null;
        }
        Utilisateur utilisateur = prestataire.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getPrenom();
    }

    private String demandePrestataireUtilisateurNom(Demandeservice demandeservice) {
        Prestataire prestataire = demandeservice.getPrestataire();
        if ( prestataire == null ) {
            return null;
        }
        Utilisateur utilisateur = prestataire.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getNom();
    }

    private int demandeContratDuree(Demandeservice demandeservice) {
        Contrat contrat = demandeservice.getContrat();
        if ( contrat == null ) {
            return 0;
        }
        return contrat.getDuree();
    }
}
