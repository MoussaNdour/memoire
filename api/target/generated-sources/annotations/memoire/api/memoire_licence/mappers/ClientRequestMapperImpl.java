package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.ClientRequestDTO;
import memoire.api.memoire_licence.entities.Client;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-30T16:24:21+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class ClientRequestMapperImpl implements ClientRequestMapper {

    @Override
    public Client toEntity(ClientRequestDTO clientRequestDTO) {
        if ( clientRequestDTO == null ) {
            return null;
        }

        Client client = new Client();

        client.setUtilisateur( clientRequestDTOToUtilisateur( clientRequestDTO ) );

        return client;
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
