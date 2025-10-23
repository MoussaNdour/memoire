package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.PrestataireRequestDTO;
import memoire.api.memoire_licence.entities.Prestataire;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-23T15:51:25+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class PrestataireRequestMapperImpl implements PrestataireRequestMapper {

    @Override
    public Prestataire toEntity(PrestataireRequestDTO prestataireDTO) {
        if ( prestataireDTO == null ) {
            return null;
        }

        Prestataire prestataire = new Prestataire();

        prestataire.setUtilisateur( prestataireRequestDTOToUtilisateur( prestataireDTO ) );

        return prestataire;
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
