package com.spring.changementserie.Service;

import com.spring.changementserie.Models.Checklist;
import com.spring.changementserie.Models.Produit;

import java.util.List;

public interface ChecklistInterface {
    public Checklist createChecklist(Checklist checklist);
    void deleteChecklist(Integer idChecklist);
    public List<Checklist> getAllChecklist();
}
