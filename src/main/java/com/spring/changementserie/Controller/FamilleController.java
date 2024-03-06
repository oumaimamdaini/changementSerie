package com.spring.changementserie.Controller;

import com.spring.changementserie.Models.Famille;
import com.spring.changementserie.Repository.FamilleRepository;
import com.spring.changementserie.Service.impl.FamilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/famille")
public class FamilleController {
    @Autowired
    private FamilleService familleService;

    @PostMapping(path="/create")
    public ResponseEntity<Famille> createFamille(@RequestBody Famille famille)
    {   Famille createdFamille = familleService.createFamille(famille);
        return ResponseEntity.ok(createdFamille);
    }
    @GetMapping(path="/getFamille")
    public List<Famille> getAllFamille() {
        return familleService.getAllFamille();
    }
    /*@GetMapping(path="/getFamille")
    public Famille getFamille() {
        return familleService.getFamille(idFamille);
    }*/
    @DeleteMapping(path="/deleteFamille/{idFamille}")
    public void deleteFamille(@PathVariable Integer idFamille){
        familleService.deleteFamille(idFamille);

    }

}
