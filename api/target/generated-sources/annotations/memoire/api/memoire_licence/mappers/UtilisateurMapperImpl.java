package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.response.UtilisateurDTO;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-23T14:37:53+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class UtilisateurMapperImpl implements UtilisateurMapper {

    @Override
    public UtilisateurDTO toDTO(Utilisateur utilisateur) {
        if ( utilisateur == null ) {
            return null;
        }

        UtilisateurDTO utilisateurDTO = new UtilisateurDTO();

        utilisateurDTO.setNom( utilisateur.getNom() );
        utilisateurDTO.setPrenom( utilisateur.getPrenom() );
        utilisateurDTO.setTelephone( utilisateur.getTelephone() );
        utilisateurDTO.setEmail( utilisateur.getEmail() );
        utilisateurDTO.setAdresse( utilisateur.getAdresse() );
        utilisateurDTO.setMotdepasse( utilisateur.getMotdepasse() );
        utilisateurDTO.setRole( utilisateur.getRole() );

        return utilisateurDTO;
    }

    @Override
    public Utilisateur toEntity(UtilisateurDTO utilisateurDTO) {
        if ( utilisateurDTO == null ) {
            return null;
        }

        Utilisateur utilisateur = new Utilisateur();

        utilisateur.setNom( utilisateurDTO.getNom() );
        utilisateur.setPrenom( utilisateurDTO.getPrenom() );
        utilisateur.setTelephone( utilisateurDTO.getTelephone() );
        utilisateur.setEmail( utilisateurDTO.getEmail() );
        utilisateur.setAdresse( utilisateurDTO.getAdresse() );
        utilisateur.setMotdepasse( utilisateurDTO.getMotdepasse() );
        utilisateur.setRole( utilisateurDTO.getRole() );

        return utilisateur;
    }
}
