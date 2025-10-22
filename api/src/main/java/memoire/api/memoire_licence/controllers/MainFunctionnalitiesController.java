package memoire.api.memoire_licence.controllers;


import memoire.api.memoire_licence.dto.response.PrestataireResponseDTO;
import memoire.api.memoire_licence.dto.response.ServiceResponseDTO;
import memoire.api.memoire_licence.entities.Prestataire;
import memoire.api.memoire_licence.entities.Service;
import memoire.api.memoire_licence.repositories.PrestataireRepository;
import memoire.api.memoire_licence.repositories.ServiceRepository;
import memoire.api.memoire_licence.services.interfaces.MainServicesInterface;
import memoire.api.memoire_licence.services.interfaces.PrestataireServiceInterface;
import memoire.api.memoire_licence.services.interfaces.ServiceForServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/main")
public class MainFunctionnalitiesController {

    @Autowired
    MainServicesInterface service;

    @Autowired
    ServiceForServiceInterface serviceForService;

    @Autowired
    PrestataireServiceInterface prestataireService;

    @Autowired
    PrestataireRepository prestataireRepository;

    @Autowired
    ServiceRepository serviceRepository;

    @PostMapping("/proposerService/{idprestataire}/{idservice}/{description}")
    public ResponseEntity<?> proposerService(@PathVariable int idprestataire, @PathVariable int idservice, @PathVariable String description){
        Prestataire prestataire=prestataireRepository.findById(idprestataire).orElse(null);
        Service service1=serviceRepository.findById(idservice).orElse(null);

        Map<String,String> response=new HashMap<>();

        if(prestataire==null)
        {
            response.put("erreur","L'id du prestataire est invalide");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
        if(service1==null){
            response.put("erreur","L'id du service est incorrecte");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }


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
