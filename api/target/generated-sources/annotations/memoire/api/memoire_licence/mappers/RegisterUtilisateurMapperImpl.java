package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.RegisterUtilisateurDTO;
import memoire.api.memoire_licence.dto.response.UtilisateurDTO;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-23T14:37:50+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class RegisterUtilisateurMapperImpl implements RegisterUtilisateurMapper {

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
    public Utilisateur toEntity(RegisterUtilisateurDTO registerUtilisateurDTO) {
        if ( registerUtilisateurDTO == null ) {
            return null;
        }

        Utilisateur utilisateur = new Utilisateur();

        utilisateur.setNom( registerUtilisateurDTO.getNom() );
        utilisateur.setPrenom( registerUtilisateurDTO.getPrenom() );
        utilisateur.setTelephone( registerUtilisateurDTO.getTelephone() );
        utilisateur.setEmail( registerUtilisateurDTO.getEmail() );
        utilisateur.setAdresse( registerUtilisateurDTO.getAdresse() );
        utilisateur.setMotdepasse( registerUtilisateurDTO.getMotdepasse() );

        return utilisateur;
    }
}
