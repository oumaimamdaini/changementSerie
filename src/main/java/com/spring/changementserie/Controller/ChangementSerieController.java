package com.spring.changementserie.Controller;

import com.spring.changementserie.Models.ChangementSerie;
import com.spring.changementserie.Service.impl.ChangementSerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/changementserie")
public class ChangementSerieController {
    @Autowired
    private ChangementSerieService changementSerieService;

    @PostMapping(path="/createChangementSerie")
    public ResponseEntity<ChangementSerie> createChangementSerie(@RequestBody ChangementSerie changementserie) {
        ChangementSerie createdChangementSerie = changementSerieService.createChangementSerie(changementserie);
        return ResponseEntity.ok(createdChangementSerie);
    }

    @DeleteMapping(path="/deleteChangementSerie/{idChangementSerie}")
    public void deleteChangementSerie(@PathVariable Integer idChangementSerie) {
        changementSerieService.deleteChangementSerie(idChangementSerie);
    }
    @GetMapping(path="/getChangementSerieById/{idChangementSerie}")
    public Optional<ChangementSerie> getChangementSerieById(@PathVariable("idChangementSerie") Integer idChangementSerie ) {
        return changementSerieService.getChangementSerieById(idChangementSerie);
    }

    @GetMapping(path="/getChangementSerie")
    public List<ChangementSerie> getAllChangementSerie() {
        return changementSerieService.getAllChangementSerie();
    }

    @PutMapping(path = "/updateChangementSerie/{idChangementSerie}")
    public ChangementSerie updateChangementSerie(@RequestBody ChangementSerie changementSerie, @PathVariable Integer idChangementSerie){
        return changementSerieService.updateChangementSerie(changementSerie,idChangementSerie);
    }

}
