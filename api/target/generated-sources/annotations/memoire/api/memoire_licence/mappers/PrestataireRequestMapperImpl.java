package memoire.api.memoire_licence.mappers;

import java.util.Date;
import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.PrestataireRequestDTO;
import memoire.api.memoire_licence.entities.Prestataire;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-22T17:05:13+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class PrestataireRequestMapperImpl implements PrestataireRequestMapper {

    @Override
    public PrestataireRequestDTO toDTO(Prestataire prestataire) {
        if ( prestataire == null ) {
            return null;
        }

        PrestataireRequestDTO prestataireRequestDTO = new PrestataireRequestDTO();

        prestataireRequestDTO.setPrenom( prestataireUtilisateurPrenom( prestataire ) );
        prestataireRequestDTO.setNom( prestataireUtilisateurNom( prestataire ) );
        prestataireRequestDTO.setEmail( prestataireUtilisateurEmail( prestataire ) );
        prestataireRequestDTO.setMotdepasse( prestataireUtilisateurMotdepasse( prestataire ) );
        prestataireRequestDTO.setTelephone( prestataireUtilisateurTelephone( prestataire ) );
        prestataireRequestDTO.setAdresse( prestataireUtilisateurAdresse( prestataire ) );
        prestataireRequestDTO.setDate_de_naissance( prestataireUtilisateurDate_de_naissance( prestataire ) );

        return prestataireRequestDTO;
    }

    @Override
    public Prestataire toEntity(PrestataireRequestDTO prestataireDTO) {
        if ( prestataireDTO == null ) {
            return null;
        }

        Prestataire prestataire = new Prestataire();

        prestataire.setUtilisateur( prestataireRequestDTOToUtilisateur( prestataireDTO ) );

        return prestataire;
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

    protected Utilisateur prestataireRequestDTOToUtilisateur(PrestataireRequestDTO prestataireRequestDTO) {
        if ( prestataireRequestDTO == null ) {
            return null;
        }

        Utilisateur utilisateur = new Utilisateur();

        utilisateur.setPrenom( prestataireRequestDTO.getPrenom() );
        utilisateur.setNom( prestataireRequestDTO.getNom() );
        utilisateur.setEmail( prestataireRequestDTO.getEmail() );
        utilisateur.setMotdepasse( prestataireRequestDTO.getMotdepasse() );
        utilisateur.setTelephone( prestataireRequestDTO.getTelephone() );
        utilisateur.setAdresse( prestataireRequestDTO.getAdresse() );
        utilisateur.setDate_de_naissance( prestataireRequestDTO.getDate_de_naissance() );

        return utilisateur;
    }
}
