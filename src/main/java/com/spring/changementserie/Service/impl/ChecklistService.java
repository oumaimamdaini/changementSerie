package com.spring.changementserie.Service.impl;

import com.spring.changementserie.Models.Checklist;
import com.spring.changementserie.Models.Produit;
import com.spring.changementserie.Repository.ChecklistRepository;
import com.spring.changementserie.Service.ChecklistInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChecklistService implements ChecklistInterface {
    @Autowired
    public ChecklistRepository checklistRepository;
    @Override
    public Checklist createChecklist(Checklist checklist) {

        return checklistRepository.save(checklist);
    }

    @Override
    public void deleteChecklist(Integer idChecklist) {
        checklistRepository.deleteById(idChecklist);
    }

    @Override
    public List<Checklist> getAllChecklist() {
        return checklistRepository.findAll();
    }
}
