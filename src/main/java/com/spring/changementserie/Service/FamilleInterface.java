package com.spring.changementserie.Service;
import com.spring.changementserie.Models.Famille;

import java.util.List;

public interface FamilleInterface {
    void deleteFamille(Integer idFamille);
    public Famille createFamille(Famille famille);
    public List<Famille> getAllFamille();
    //public Famille getFamille(Integer idFamille);
}
