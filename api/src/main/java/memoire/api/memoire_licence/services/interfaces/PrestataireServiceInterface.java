package memoire.api.memoire_licence.services.interfaces;

import memoire.api.memoire_licence.dto.request.PrestataireRequestDTO;
import memoire.api.memoire_licence.dto.response.PrestataireResponseDTO;

import java.util.List;

public interface PrestataireServiceInterface
{

    List<PrestataireResponseDTO> findAll();

    PrestataireResponseDTO findById(int idpresta);

    boolean create(PrestataireRequestDTO prestataireDTO);

    boolean update(int idpresta, PrestataireRequestDTO prestataireDTO);

    boolean deleteById(int idpresta);
}
