package memoire.api.memoire_licence.mappers;

import java.util.Date;
import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.response.ClientResponseDTO;
import memoire.api.memoire_licence.entities.Client;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-30T16:24:22+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class ClientResponseMapperImpl implements ClientResponseMapper {

    @Override
    public ClientResponseDTO toDTO(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientResponseDTO clientResponseDTO = new ClientResponseDTO();

        clientResponseDTO.setPrenom( clientUtilisateurPrenom( client ) );
        clientResponseDTO.setNom( clientUtilisateurNom( client ) );
        clientResponseDTO.setEmail( clientUtilisateurEmail( client ) );
        clientResponseDTO.setMotdepasse( clientUtilisateurMotdepasse( client ) );
        clientResponseDTO.setTelephone( clientUtilisateurTelephone( client ) );
        clientResponseDTO.setAdresse( clientUtilisateurAdresse( client ) );
        clientResponseDTO.setDate_de_naissance( clientUtilisateurDate_de_naissance( client ) );
        clientResponseDTO.setRole( clientUtilisateurRole( client ) );
        clientResponseDTO.setIdclient( client.getIdclient() );

        return clientResponseDTO;
    }

    private String clientUtilisateurPrenom(Client client) {
        Utilisateur utilisateur = client.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getPrenom();
    }

    private String clientUtilisateurNom(Client client) {
        Utilisateur utilisateur = client.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getNom();
    }

    private String clientUtilisateurEmail(Client client) {
        Utilisateur utilisateur = client.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getEmail();
    }

    private String clientUtilisateurMotdepasse(Client client) {
        Utilisateur utilisateur = client.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getMotdepasse();
    }

    private Long clientUtilisateurTelephone(Client client) {
        Utilisateur utilisateur = client.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getTelephone();
    }

    private String clientUtilisateurAdresse(Client client) {
        Utilisateur utilisateur = client.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getAdresse();
    }

    private Date clientUtilisateurDate_de_naissance(Client client) {
        Utilisateur utilisateur = client.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getDate_de_naissance();
    }

    private String clientUtilisateurRole(Client client) {
        Utilisateur utilisateur = client.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        return utilisateur.getRole();
    }
}
