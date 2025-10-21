package memoire.api.memoire_licence.controllers;

import memoire.api.memoire_licence.dto.request.CategorieRequestDTO;
import memoire.api.memoire_licence.dto.response.CategorieResponseDTO;
import memoire.api.memoire_licence.services.interfaces.CategorieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categorie")
public class CategorieRestController {

    @Autowired
    CategorieServiceInterface service;

    @GetMapping("")
    public ResponseEntity<List<CategorieResponseDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{idcategorie}")
    public ResponseEntity<CategorieResponseDTO> findById(@PathVariable int idcategorie){
        CategorieResponseDTO categorie=service.findById(idcategorie);
        if(categorie==null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(categorie);
    }


    @PostMapping("")
    public ResponseEntity<Void> create(CategorieRequestDTO requestDTO){
        service.save(requestDTO);

        return ResponseEntity.ok().build();
    }

    @PutMapping("/{idcategorie}")
    public ResponseEntity<Void> update(@PathVariable int idcategorie, @RequestBody CategorieRequestDTO requestDTO){
        boolean test=service.update(idcategorie,requestDTO);

        if(test)
            return ResponseEntity.ok().build();
        else
            return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{idcategorie}")
    public ResponseEntity<Void> delete(@PathVariable int idcategorie){
        service.deleteById(idcategorie);

        return ResponseEntity.ok().build();
    }
}
