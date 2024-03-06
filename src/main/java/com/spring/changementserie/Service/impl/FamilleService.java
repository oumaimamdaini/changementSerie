package com.spring.changementserie.Service.impl;

import com.spring.changementserie.Models.Famille;
import com.spring.changementserie.Repository.FamilleRepository;
import com.spring.changementserie.Service.FamilleInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilleService implements FamilleInterface {

    @Autowired
    private FamilleRepository familleRepository;
    /*@Override
    public Famille getFamille(Integer idFamille){
        return  familleRepository.findById(idFamille);
    }*/
    @Override
    public List<Famille> getAllFamille() {
        return familleRepository.findAll();
    }


    @Override
    public void deleteFamille(Integer idFamille) {
        familleRepository.deleteById(idFamille);
    }
@Override
    public Famille createFamille(Famille famille){
        return  familleRepository.save(famille);
    }


}
