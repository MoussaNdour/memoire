package memoire.api.memoire_licence.mappers;

import java.util.Date;
import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.AdministrateurRequestDTO;
import memoire.api.memoire_licence.entities.Administrateur;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-22T17:05:12+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class AdministrateurRequestMapperImpl implements AdministrateurRequestMapper {

    @Override
    public Administrateur toEntity(AdministrateurRequestDTO adminDTO) {
        if ( adminDTO == null ) {
            return null;
        }

        Administrateur administrateur = new Administrateur();

        administrateur.setUtilisateur( administrateurRequestDTOToUtilisateur( adminDTO ) );
        administrateur.setCodedaccess( adminDTO.getCodedaccess() );

        return administrateur;
    }

    @Override
    public AdministrateurRequestDTO toDTO(Administrateur admin) {
        if ( admin == null ) {
            return null;
        }

        AdministrateurRequestDTO administrateurRequestDTO = new AdministrateurRequestDTO();

        administrateurRequestDTO.setPrenom( adminUtilisateurPrenom( admin ) );
        administrateurRequestDTO.setNom( adminUtilisateurNom( admin ) );
        administrateurRequestDTO.setEmail( adminUtilisateurEmail( admin ) );
        administrateurRequestDTO.setMotdepasse( adminUtilisateurMotdepasse( admin ) );
        administrateurRequestDTO.setTelephone( adminUtilisateurTelephone( admin ) );
        administrateurRequestDTO.setAdresse( adminUtilisateurAdresse( admin ) );
        administrateurRequestDTO.setDate_de_naissance( adminUtilisateurDate_de_naissance( admin ) );
        administrateurRequestDTO.setCodedaccess( admin.getCodedaccess() );

        return administrateurRequestDTO;
    }

    protected Utilisateur administrateurRequestDTOToUtilisateur(AdministrateurRequestDTO administrateurRequestDTO) {
        if ( administrateurRequestDTO == null ) {
            return null;
        }

        Utilisateur utilisateur = new Utilisateur();

        utilisateur.setPrenom( administrateurRequestDTO.getPrenom() );
        utilisateur.setNom( administrateurRequestDTO.getNom() );
        utilisateur.setEmail( administrateurRequestDTO.getEmail() );
        utilisateur.setMotdepasse( administrateurRequestDTO.getMotdepasse() );
        utilisateur.setTelephone( administrateurRequestDTO.getTelephone() );
        utilisateur.setAdresse( administrateurRequestDTO.getAdresse() );
        utilisateur.setDate_de_naissance( administrateurRequestDTO.getDate_de_naissance() );

        return utilisateur;
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

    private Date adminUtilisateurDate_de_naissance(Administrateur administrateur) {
        Utilisateur utilisateur = administrateur.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getDate_de_naissance();
    }
}
