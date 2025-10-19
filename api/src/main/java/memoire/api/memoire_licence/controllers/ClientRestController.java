package memoire.api.memoire_licence.controllers;

import java.util.List;

import memoire.api.memoire_licence.dto.request.ClientRequestDTO;
import memoire.api.memoire_licence.dto.response.ClientResponseDTO;
import memoire.api.memoire_licence.services.classes.ClientService;
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
@RequestMapping(value = "/api/v1/client", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientRestController {

	@Autowired
	private ClientService service;
	

    
	/**
	 * Get ALL
	 *
	 * @return
	 */
	@GetMapping("")
	protected ResponseEntity<List<ClientResponseDTO>> findAll() {

		return ResponseEntity.ok(service.findAll());
    }
    
    /**
     * Get ONE identified by the given PK
	 * @param idclient
     * @return 200 or 404 
     */
    @GetMapping("/{idclient}")
    protected ResponseEntity<?> findById(@PathVariable int idclient) {
    	ClientResponseDTO dto=service.findById(idclient);

		if(dto!=null){
			return ResponseEntity.ok(dto);
		}
		else{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Client non trouve pour cet id");
		}
    }

    
	/**
 	 * Create if doesn't exist 
	 *
	 * @param clientDTO
	 * @return 201 created or 409 conflict
	 */
	@PostMapping("")
	protected ResponseEntity<?> create(@RequestBody ClientRequestDTO clientDTO) {
    	boolean test=service.create(clientDTO);
		if(test)
			return ResponseEntity.ok("Client cree avec succes");
		else
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Il existe deja un client avec ce mail");
	}

	/**
	 * Update or create
	 *
	 * @param idclient
	 * @param clientDTO
	 * @return 200 updated or created
	 */
	@PutMapping("/{idclient}")
	protected ResponseEntity<?> update( @PathVariable int idclient, @RequestBody ClientRequestDTO clientDTO) {
		boolean test=service.update(idclient,clientDTO);
		if(test)
			return ResponseEntity.ok("Client modifier avec success");
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Il n'existe pas un client avec un tel id");
	}



	/**
	 * Delete by PK 
	 *
	 * @param idclient
	 * @return 204 deleted or 404 not found
	 */
	@DeleteMapping("/{idclient}")
	protected ResponseEntity<?> deleteById(@PathVariable int idclient) {
    	service.deleteById(idclient);

		return ResponseEntity.ok("Client supprimer avec succes");
	}

}
