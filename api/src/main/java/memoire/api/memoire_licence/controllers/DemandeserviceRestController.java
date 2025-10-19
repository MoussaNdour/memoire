package memoire.api.memoire_licence.controllers;

import java.util.List;

import memoire.api.memoire_licence.dto.request.DemandeServiceRequestDTO;
import memoire.api.memoire_licence.dto.response.DemandeServiceResponseDTO;
import memoire.api.memoire_licence.services.classes.DemandeserviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/api/v1/demandeservice", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemandeserviceRestController {


	@Autowired
	private DemandeserviceService service ; // injected
	

	/**
	 * Get ALL
	 *
	 * @return
	 */
	@GetMapping("")
	protected ResponseEntity<List<DemandeServiceResponseDTO>> findAll() {
		return ResponseEntity.ok(service.findAll());
    }
    
    /**
     * Get ONE identified by the given PK
	 *
	 * @param iddemande
     * @return 200 or 404 
     */
    @GetMapping("/{iddemande}")
    protected ResponseEntity<?> findById(@PathVariable int iddemande) {
		DemandeServiceResponseDTO demande=service.find(iddemande);

		if(demande==null){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		else{
			return ResponseEntity.ok(demande);
		}
    }

    
	/**
 	 * Create if doesn't exist 
	 *
	 * @param demandeserviceDTO
	 * @return 201 created or 409 conflict
	 */
	@PostMapping("")
	protected ResponseEntity<Void> create(@RequestBody DemandeServiceRequestDTO demandeserviceDTO) {
		service.save(demandeserviceDTO);

		return ResponseEntity.ok().build();
	}

	/**
	 * Update or create
	 *
	 * @param iddemande
	 * @param demandeserviceDTO
	 * @return 200 updated or created
	 */
	@PutMapping("/{iddemande}")
	protected ResponseEntity<?> update(@PathVariable int iddemande, @RequestBody DemandeServiceRequestDTO demandeserviceDTO) {
		boolean test=service.update(iddemande,demandeserviceDTO);

		if(test)
			return ResponseEntity.ok().build();
		else
			return ResponseEntity.notFound().build();
	}



	/**
	 * Delete by PK 
	 *
	 * @param iddemande
	 * @return 204 deleted or 404 not found
	 */
	@DeleteMapping("/{iddemande}")
	protected ResponseEntity<Void> deleteById(@PathVariable int iddemande) {
		service.delete(iddemande);

		return ResponseEntity.ok().build();
	}

}
