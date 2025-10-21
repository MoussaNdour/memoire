package memoire.api.memoire_licence.mappers;

import java.util.Date;
import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.ClientRequestDTO;
import memoire.api.memoire_licence.entities.Client;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-20T17:56:09+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class ClientRequestMapperImpl implements ClientRequestMapper {

    @Override
    public ClientRequestDTO toDTO(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientRequestDTO clientRequestDTO = new ClientRequestDTO();

        clientRequestDTO.setPrenom( clientUtilisateurPrenom( client ) );
        clientRequestDTO.setNom( clientUtilisateurNom( client ) );
        clientRequestDTO.setEmail( clientUtilisateurEmail( client ) );
        clientRequestDTO.setMotdepasse( clientUtilisateurMotdepasse( client ) );
        clientRequestDTO.setTelephone( clientUtilisateurTelephone( client ) );
        clientRequestDTO.setAdresse( clientUtilisateurAdresse( client ) );
        clientRequestDTO.setDate_de_naissance( clientUtilisateurDate_de_naissance( client ) );

        return clientRequestDTO;
    }

    @Override
    public Client toEntity(ClientRequestDTO clientRequestDTO) {
        if ( clientRequestDTO == null ) {
            return null;
        }

        Client client = new Client();

        client.setUtilisateur( clientRequestDTOToUtilisateur( clientRequestDTO ) );

        return client;
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

    protected Utilisateur clientRequestDTOToUtilisateur(ClientRequestDTO clientRequestDTO) {
        if ( clientRequestDTO == null ) {
            return null;
        }

        Utilisateur utilisateur = new Utilisateur();

        utilisateur.setPrenom( clientRequestDTO.getPrenom() );
        utilisateur.setNom( clientRequestDTO.getNom() );
        utilisateur.setEmail( clientRequestDTO.getEmail() );
        utilisateur.setMotdepasse( clientRequestDTO.getMotdepasse() );
        utilisateur.setTelephone( clientRequestDTO.getTelephone() );
        utilisateur.setAdresse( clientRequestDTO.getAdresse() );
        utilisateur.setDate_de_naissance( clientRequestDTO.getDate_de_naissance() );

        return utilisateur;
    }
}
