package memoire.api.memoire_licence.controllers;

import java.util.List;

import memoire.api.memoire_licence.dto.request.ContratRequestDTO;
import memoire.api.memoire_licence.services.classes.ContratService;
import memoire.api.memoire_licence.dto.response.ContratResponseDTO;
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
@RequestMapping(value = "/api/v1/contrat", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContratRestController {


	@Autowired
	private ContratService service ; // injected

    
	/**
	 * Get ALL
	 *
	 * @return
	 */
	@GetMapping("")
	protected ResponseEntity<List<ContratResponseDTO>> findAll() {
		return ResponseEntity.ok(service.findAll());
    }
    
    /**
     * Get ONE identified by the given PK
	 *
	 * @param idcontrat
     * @return 200 or 404 
     */
    @GetMapping("/{idcontrat}")
    protected ResponseEntity<?> findById(@PathVariable int idcontrat) {
		ContratResponseDTO contrat=service.find(idcontrat);

		if(contrat==null){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Contrat non trouver pour cet id");
		}
		else{
			return ResponseEntity.ok(contrat);
		}

    }

    
	/**
 	 * Create if doesn't exist 
	 *
	 * @param contratDTO
	 * @return 201 created or 409 conflict
	 */
	@PostMapping("")
	protected ResponseEntity<Void> create(@RequestBody ContratRequestDTO contratDTO) {
		service.save(contratDTO);
		return ResponseEntity.ok().build();
	}

	/**
	 * Update or create
	 *
	 * @param idcontrat
	 * @param contratDTO
	 * @return 200 updated or created
	 */
	@PutMapping("/{idcontrat}")
	protected ResponseEntity<Void> update(@PathVariable int idcontrat, @RequestBody ContratRequestDTO contratDTO) {
		boolean test=service.update(idcontrat,contratDTO);

		if(test)
			return ResponseEntity.ok().build();
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}





	/**
	 * Delete by PK 
	 *
	 * @param idcontrat
	 * @return 204 deleted or 404 not found
	 */
	@DeleteMapping("/{idcontrat}")
	protected ResponseEntity<Void> deleteById(@PathVariable int idcontrat) {
		service.delete(idcontrat);

		return ResponseEntity.ok().build();
	}

}
