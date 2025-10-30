package memoire.api.memoire_licence.mappers;

import javax.annotation.processing.Generated;
import memoire.api.memoire_licence.dto.request.AdministrateurRequestDTO;
import memoire.api.memoire_licence.entities.Administrateur;
import memoire.api.memoire_licence.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-30T16:24:22+0000",
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

        return administrateur;
    }

    protected Utilisateur administrateurRequestDTOToUtilisateur(AdministrateurRequestDTO administrateurRequestDTO) {
        if ( administrateurRequestDTO == null ) {
            return null;
        }

        Utilisateur utilisateur = new Utilisateur();

        utilisateur.setEmail( administrateurRequestDTO.getEmail() );
        utilisateur.setMotdepasse( administrateurRequestDTO.getMotdepasse() );

        return utilisateur;
    }
}
