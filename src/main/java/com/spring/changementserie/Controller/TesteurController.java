package com.spring.changementserie.Controller;

import com.spring.changementserie.Models.Testeur;
import com.spring.changementserie.Service.impl.TesteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/testeur")
public class TesteurController {
    @Autowired
    private TesteurService testeurService;
    @PostMapping(path="/createTesteur")
    public ResponseEntity<Testeur> createTesteur(@RequestBody Testeur testeur)
    {   Testeur createdtesteur = testeurService.createTesteur(testeur);
        return ResponseEntity.ok(createdtesteur);
    }
    @GetMapping(path="/getTesteurs")
    public List<Testeur> getAllTesteur() {
        return testeurService.getAllTesteur();
    }
    @GetMapping(path="/getTesteurById/{idTesteur}")
    public Optional<Testeur> getTesteurById(@PathVariable("idTesteur") Integer idTesteur ) {
        return testeurService.getTesteurByid(idTesteur);
    }
    @DeleteMapping(path="/deleteTesteur/{idTesteur}")
    public void deleteTesteur(@PathVariable Integer idTesteur){
        testeurService.deleteTesteur(idTesteur);

    }
    @PutMapping(path = "/updateTesteur/{idTesteur}")
    public Testeur updateTesteur(@RequestBody Testeur testeur,@PathVariable Integer idTesteur){
        return testeurService.updateTesteur(testeur,idTesteur);
    }
}
