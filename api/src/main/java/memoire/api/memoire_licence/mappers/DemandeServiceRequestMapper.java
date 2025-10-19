package memoire.api.memoire_licence.mappers;

import memoire.api.memoire_licence.dto.request.DemandeServiceRequestDTO;
import memoire.api.memoire_licence.entities.Demandeservice;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DemandeServiceRequestMapper {

    @Mapping(target = "iddemande", ignore = true)
    @Mapping(target = "statut", ignore = true)
    @Mapping(target = "paiement", ignore = true)
    @Mapping(source = "idclient", target = "client.idclient")
    @Mapping(source = "idprestataire", target = "prestataire.idprestataire")
    @Mapping(source = "idservice", target = "service.idservice")
    @Mapping(source = "idcontrat", target = "contrat.idcontrat")
    Demandeservice toEntity(DemandeServiceRequestDTO dto);


    @Mapping(source = "client.idclient", target = "idclient")
    @Mapping(source = "prestataire.idprestataire", target = "idprestataire")
    @Mapping(source = "service.idservice", target = "idservice")
    @Mapping(source = "contrat.idcontrat", target = "idcontrat")
    DemandeServiceRequestDTO toDTO(Demandeservice demande);
}
