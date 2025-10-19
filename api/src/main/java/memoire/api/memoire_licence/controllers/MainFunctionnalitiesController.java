package memoire.api.memoire_licence.controllers;


import memoire.api.memoire_licence.entities.Service;
import memoire.api.memoire_licence.services.interfaces.MainServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/main")
public class MainFunctionnalitiesController {

    @Autowired
    MainServicesInterface service;

    @PostMapping("/proposerService/{idprestataire}/{idservice}/{description}")
    public ResponseEntity<Void> proposerService(@PathVariable int idprestataire, @PathVariable int idservice, @PathVariable String description){

        boolean test=service.proposerService(idprestataire,idservice,description);

        return ResponseEntity.ok().build();

    }

    @GetMapping("/servicesProposees")
    public ResponseEntity<List<Service>> servicesProposees(){
        return ResponseEntity.ok(service.servicesProposees());
    }
}
