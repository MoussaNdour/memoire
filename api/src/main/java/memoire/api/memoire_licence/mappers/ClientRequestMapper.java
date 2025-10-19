package memoire.api.memoire_licence.mappers;


import memoire.api.memoire_licence.dto.request.ClientRequestDTO;
import memoire.api.memoire_licence.entities.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientRequestMapper {

    @Mapping(source = "utilisateur.prenom",target = "prenom")
    @Mapping(source = "utilisateur.nom",target = "nom")
    @Mapping(source = "utilisateur.email",target = "email")
    @Mapping(source = "utilisateur.motdepasse",target = "motdepasse")
    @Mapping(source = "utilisateur.telephone",target = "telephone")
    @Mapping(source = "utilisateur.adresse",target = "adresse")
    @Mapping(source = "utilisateur.date_de_naissance",target = "date_de_naissance")
    ClientRequestDTO toDTO(Client client);


    @Mapping(source = "prenom",target = "utilisateur.prenom")
    @Mapping(source = "nom",target = "utilisateur.nom")
    @Mapping(source = "email",target = "utilisateur.email")
    @Mapping(source = "motdepasse",target = "utilisateur.motdepasse")
    @Mapping(source = "telephone",target = "utilisateur.telephone")
    @Mapping(source = "adresse",target = "utilisateur.adresse")
    @Mapping(source="date_de_naissance",target = "utilisateur.date_de_naissance")
    Client toEntity(ClientRequestDTO clientRequestDTO);
}
