package memoire.api.memoire_licence.mappers;

import java.util.Date;
import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.response.PrestataireResponseDTO;
import memoire.api.memoire_licence.entities.Prestataire;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-23T14:37:51+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class PrestataireResponseMapperImpl implements PrestataireResponseMapper {

    @Override
    public PrestataireResponseDTO toDTO(Prestataire prestataire) {
        if ( prestataire == null ) {
            return null;
        }

        PrestataireResponseDTO prestataireResponseDTO = new PrestataireResponseDTO();

        prestataireResponseDTO.setPrenom( prestataireUtilisateurPrenom( prestataire ) );
        prestataireResponseDTO.setNom( prestataireUtilisateurNom( prestataire ) );
        prestataireResponseDTO.setEmail( prestataireUtilisateurEmail( prestataire ) );
        prestataireResponseDTO.setMotdepasse( prestataireUtilisateurMotdepasse( prestataire ) );
        prestataireResponseDTO.setTelephone( prestataireUtilisateurTelephone( prestataire ) );
        prestataireResponseDTO.setAdresse( prestataireUtilisateurAdresse( prestataire ) );
        prestataireResponseDTO.setDate_de_naissance( prestataireUtilisateurDate_de_naissance( prestataire ) );
        prestataireResponseDTO.setRole( prestataireUtilisateurRole( prestataire ) );
        prestataireResponseDTO.setIdprestataire( prestataire.getIdprestataire() );

        return prestataireResponseDTO;
    }

    private String prestataireUtilisateurPrenom(Prestataire prestataire) {
        Utilisateur utilisateur = prestataire.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getPrenom();
    }

    private String prestataireUtilisateurNom(Prestataire prestataire) {
        Utilisateur utilisateur = prestataire.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getNom();
    }

    private String prestataireUtilisateurEmail(Prestataire prestataire) {
        Utilisateur utilisateur = prestataire.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getEmail();
    }

    private String prestataireUtilisateurMotdepasse(Prestataire prestataire) {
        Utilisateur utilisateur = prestataire.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getMotdepasse();
    }

    private Long prestataireUtilisateurTelephone(Prestataire prestataire) {
        Utilisateur utilisateur = prestataire.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getTelephone();
    }

    private String prestataireUtilisateurAdresse(Prestataire prestataire) {
        Utilisateur utilisateur = prestataire.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getAdresse();
    }

    private Date prestataireUtilisateurDate_de_naissance(Prestataire prestataire) {
        Utilisateur utilisateur = prestataire.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getDate_de_naissance();
    }

    private String prestataireUtilisateurRole(Prestataire prestataire) {
        Utilisateur utilisateur = prestataire.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getRole();
    }
}
