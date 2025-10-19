package memoire.api.memoire_licence.mappers;

import memoire.api.memoire_licence.dto.response.ServiceResponseDTO;
import memoire.api.memoire_licence.entities.Service;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceResponseMapper {


    ServiceResponseDTO toDTO(Service service);
}
