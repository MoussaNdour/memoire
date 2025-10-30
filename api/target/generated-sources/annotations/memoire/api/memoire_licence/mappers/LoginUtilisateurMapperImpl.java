package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.response.UtilisateurDTO;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-30T16:24:21+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class LoginUtilisateurMapperImpl implements LoginUtilisateurMapper {

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
}
