package memoire.api.memoire_licence.mappers;

import memoire.api.memoire_licence.dto.request.ServiceRequestDTO;
import memoire.api.memoire_licence.entities.Service;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceRequestMapper {

    Service toEntity(ServiceRequestDTO serviceRequestDTO);

    ServiceRequestDTO toDTO(Service service);
}
