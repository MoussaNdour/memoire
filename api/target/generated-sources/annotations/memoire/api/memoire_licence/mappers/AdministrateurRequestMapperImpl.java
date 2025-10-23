package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.AdministrateurRequestDTO;
import memoire.api.memoire_licence.entities.Administrateur;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-23T15:51:29+0000",
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

        return utilisateur;
    }
}
