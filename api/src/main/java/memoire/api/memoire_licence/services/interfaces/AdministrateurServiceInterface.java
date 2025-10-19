package memoire.api.memoire_licence.services.interfaces;

import memoire.api.memoire_licence.dto.request.AdministrateurRequestDTO;
import memoire.api.memoire_licence.dto.response.AdministrateurResponseDTO;

import java.util.List;

public interface AdministrateurServiceInterface {

    List<AdministrateurResponseDTO> findAll();

    AdministrateurResponseDTO findById(int idadmin);

    boolean save(AdministrateurRequestDTO administrateurDTO);

    boolean update(int id,AdministrateurRequestDTO administrateurDTO);

    boolean deleteById(int idadmin);
}
