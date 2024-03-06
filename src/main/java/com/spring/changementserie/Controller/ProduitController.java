package com.spring.changementserie.Controller;
import com.spring.changementserie.Models.Produit;
import com.spring.changementserie.Service.impl.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/produit")
public class ProduitController {
    @Autowired
    private ProduitService produitService;
    @PostMapping(path="/createProduit")
    public ResponseEntity<Produit> createProduit(@RequestBody Produit produit)
    {   Produit createdProduit = produitService.createProduit(produit);
        return ResponseEntity.ok(createdProduit);
    }
    @GetMapping(path = "/getAllProduit")
    public List<Produit> getAllProduit(){
        return produitService.getAllProduit();
    }
    @DeleteMapping(path="/deleteProduit/{idProduit}")
    public void deleteProduit(@PathVariable Integer idProduit){
        produitService.deleteProduit(idProduit);

    }
}
