package memoire.api.memoire_licence.services.interfaces;

import memoire.api.memoire_licence.dto.request.DemandeServiceRequestDTO;
import memoire.api.memoire_licence.dto.response.DemandeServiceResponseDTO;

import java.util.List;

public interface DemandeserviceServiceInterface {
    boolean save(DemandeServiceRequestDTO dto);

    List<DemandeServiceResponseDTO> findAll();

    boolean update(int id, DemandeServiceRequestDTO dto);

    DemandeServiceResponseDTO find(int id);

    void delete(int id);
}
