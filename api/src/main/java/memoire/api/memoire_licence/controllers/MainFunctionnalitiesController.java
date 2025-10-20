package memoire.api.memoire_licence.controllers;


import memoire.api.memoire_licence.dto.response.PrestataireResponseDTO;
import memoire.api.memoire_licence.dto.response.ServiceResponseDTO;
import memoire.api.memoire_licence.entities.Service;
import memoire.api.memoire_licence.services.classes.PrestataireService;
import memoire.api.memoire_licence.services.classes.ServiceForServiceEntity;
import memoire.api.memoire_licence.services.interfaces.MainServicesInterface;
import memoire.api.memoire_licence.services.interfaces.PrestataireServiceInterface;
import memoire.api.memoire_licence.services.interfaces.ServiceForServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/main")
public class MainFunctionnalitiesController {

    @Autowired
    MainServicesInterface service;

    @Autowired
    ServiceForServiceInterface serviceForService;

    @Autowired
    PrestataireServiceInterface prestataireService;

    @PostMapping("/proposerService/{idprestataire}/{idservice}/{description}")
    public ResponseEntity<Void> proposerService(@PathVariable int idprestataire, @PathVariable int idservice, @PathVariable String description){

        boolean test=service.proposerService(idprestataire,idservice,description);

        return ResponseEntity.ok().build();

    }

    @GetMapping("/servicesProposees")
    public ResponseEntity<List<Service>> servicesProposees(){
        return ResponseEntity.ok(service.servicesProposees());
    }

    @GetMapping("/services")
    public ResponseEntity<List<ServiceResponseDTO>> getServices(){
        return ResponseEntity.ok(serviceForService.findAll());
    }

    @GetMapping("/prestataires")
    public ResponseEntity<List<PrestataireResponseDTO>> getPrestataires(){
        return ResponseEntity.ok(prestataireService.findAll());
    }
}
