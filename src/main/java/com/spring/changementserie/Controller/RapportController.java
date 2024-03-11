package com.spring.changementserie.Controller;

import com.spring.changementserie.Models.Famille;
import com.spring.changementserie.Models.Rapport;
import com.spring.changementserie.Service.impl.FamilleService;
import com.spring.changementserie.Service.impl.RapportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/rapport")
public class RapportController {

    @Autowired
    private RapportService rapportservice;
    @PostMapping(path="/createRapport")
    public ResponseEntity<Rapport> createRapport(@RequestBody Rapport rapport)
    {   Rapport createdRapport = rapportservice.createRapport(rapport);
        return ResponseEntity.ok(createdRapport);
    }
    @GetMapping(path="/getRapportById/{idRapport}")
    public Optional<Rapport> getRapportById(@PathVariable("idRapport") Integer idRapport ) {
        return rapportservice.getByid(idRapport);
    }
    @GetMapping(path="/getAllRapport")
    public List<Rapport> getAllRapport() {
        return rapportservice.getAllRapport();
    }
    @DeleteMapping(path="/deleteRapport/{idRapport}")
    public void deleteRapport(@PathVariable Integer idRapport){
        rapportservice.deleteRapport(idRapport);

    }
    @PutMapping(path = "/updateRapport/{idRapport}")
    public Rapport updateRapport(@RequestBody Rapport rapport,@PathVariable Integer idRapport){
        return rapportservice.updateRapport(rapport,idRapport);
    }
}
