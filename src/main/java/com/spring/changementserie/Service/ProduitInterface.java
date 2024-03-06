package com.spring.changementserie.Service;

import com.spring.changementserie.Models.Famille;
import com.spring.changementserie.Models.Produit;

import java.util.List;

public interface ProduitInterface {
    void deleteProduit(Integer idProduit);
    public Produit createProduit(Produit produit);
    public List<Produit> getAllProduit();
}
