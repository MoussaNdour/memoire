package memoire.api.memoire_licence.services.interfaces;

import memoire.api.memoire_licence.dto.request.ClientRequestDTO;
import memoire.api.memoire_licence.dto.response.ClientResponseDTO;

import java.util.List;

public interface ClientServiceInterface {

    List<ClientResponseDTO> findAll();

    ClientResponseDTO findById(int idclient);

    boolean create(ClientRequestDTO clientDTO);

    boolean update(int idclient, ClientRequestDTO clientDTO);

    boolean deleteById(int idclient);
}
