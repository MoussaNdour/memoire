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
    @Mapping(source = "daterendezvous", target = "daterendezvous")
    Demandeservice toEntity(DemandeServiceRequestDTO dto);

}
