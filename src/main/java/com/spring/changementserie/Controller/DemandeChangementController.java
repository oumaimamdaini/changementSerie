package com.spring.changementserie.Controller;

import com.spring.changementserie.Models.DemandeChangement;

import com.spring.changementserie.Service.impl.DemandeChangementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/demandechangement")
public class DemandeChangementController {
    @Autowired
    private DemandeChangementService demandeChangementService;
    @PostMapping(path="/createDemandeChangement")
    public ResponseEntity<DemandeChangement> createDemandeChangement(@RequestBody DemandeChangement demandeChangement) {
        DemandeChangement createdDemandeChangement = demandeChangementService.createDemandeChangement(demandeChangement);
        return ResponseEntity.ok(createdDemandeChangement);
    }

    @DeleteMapping(path="/deleteDemandeChangement/{idDemandeChangement}")
    public void deleteDemandeChangement(@PathVariable Integer idDemandeChangement) {
        demandeChangementService.deleteDemandeChangement(idDemandeChangement);
    }
    @GetMapping(path="/getDemandeChangementById/{idDemandeChangement}")
    public Optional<DemandeChangement> getDemandeChangementById(@PathVariable("idDemandeChangement") Integer idDemandeChangement ) {
        return demandeChangementService.getDemandeChangementByid(idDemandeChangement);
    }

    @GetMapping(path="/getDemandeChangement")
    public List<DemandeChangement> getAllDemandeChangement() {
        return demandeChangementService.getAllDemandeChangement();
    }
    @PutMapping(path = "/updateDemandeChangement/{idDemandeChangement}")
    public DemandeChangement updateDemandeChangement(@RequestBody DemandeChangement demandeChangement, @PathVariable Integer idDemandeChangement){
        return demandeChangementService.updateDemandeChangement(demandeChangement,idDemandeChangement);
    }
}
