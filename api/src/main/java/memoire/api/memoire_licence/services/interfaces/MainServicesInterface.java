package memoire.api.memoire_licence.services.interfaces;


import memoire.api.memoire_licence.dto.response.PrestataireResponseDTO;
import memoire.api.memoire_licence.entities.Prestataire;
import memoire.api.memoire_licence.entities.Service;

import java.util.List;

public interface MainServicesInterface {

    boolean proposerService(int idprestataire, int idservice, String description);

    List<Service> servicesProposees();

    List<PrestataireResponseDTO> findPrestatairesByService(int id);
}
