package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.response.AdministrateurResponseDTO;
import memoire.api.memoire_licence.entities.Administrateur;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-22T17:05:14+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class AdministrateurResponseMapperImpl implements AdministrateurResponseMapper {

    @Override
    public AdministrateurResponseDTO toDTO(Administrateur admin) {
        if ( admin == null ) {
            return null;
        }

        AdministrateurResponseDTO administrateurResponseDTO = new AdministrateurResponseDTO();

        administrateurResponseDTO.setPrenom( adminUtilisateurPrenom( admin ) );
        administrateurResponseDTO.setNom( adminUtilisateurNom( admin ) );
        administrateurResponseDTO.setEmail( adminUtilisateurEmail( admin ) );
        administrateurResponseDTO.setMotdepasse( adminUtilisateurMotdepasse( admin ) );
        administrateurResponseDTO.setTelephone( adminUtilisateurTelephone( admin ) );
        administrateurResponseDTO.setAdresse( adminUtilisateurAdresse( admin ) );
        administrateurResponseDTO.setRole( adminUtilisateurRole( admin ) );
        administrateurResponseDTO.setActif( adminUtilisateurActif( admin ) );
        administrateurResponseDTO.setCodedaccess( admin.getCodedaccess() );
        administrateurResponseDTO.setIdadmin( admin.getIdadmin() );

        return administrateurResponseDTO;
    }

    private String adminUtilisateurPrenom(Administrateur administrateur) {
        Utilisateur utilisateur = administrateur.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getPrenom();
    }

    private String adminUtilisateurNom(Administrateur administrateur) {
        Utilisateur utilisateur = administrateur.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getNom();
    }

    private String adminUtilisateurEmail(Administrateur administrateur) {
        Utilisateur utilisateur = administrateur.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getEmail();
    }

    private String adminUtilisateurMotdepasse(Administrateur administrateur) {
        Utilisateur utilisateur = administrateur.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getMotdepasse();
    }

    private Long adminUtilisateurTelephone(Administrateur administrateur) {
        Utilisateur utilisateur = administrateur.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getTelephone();
    }

    private String adminUtilisateurAdresse(Administrateur administrateur) {
        Utilisateur utilisateur = administrateur.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getAdresse();
    }

    private String adminUtilisateurRole(Administrateur administrateur) {
        Utilisateur utilisateur = administrateur.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getRole();
    }

    private boolean adminUtilisateurActif(Administrateur administrateur) {
        Utilisateur utilisateur = administrateur.getUtilisateur();
        if ( utilisateur == null ) {
            return false;
        }
        return utilisateur.isActif();
    }
}
