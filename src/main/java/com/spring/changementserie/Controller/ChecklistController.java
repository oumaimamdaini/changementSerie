package com.spring.changementserie.Controller;

import com.spring.changementserie.Models.ChangementSerie;
import com.spring.changementserie.Models.Checklist;
import com.spring.changementserie.Service.impl.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/checklist")
public class ChecklistController {
    @Autowired
    private ChecklistService checklistService;
    @PostMapping(path="/createChecklist")
    public ResponseEntity<Checklist> createChecklist(@RequestBody Checklist checklist)
    {   Checklist createdChecklist = checklistService.createChecklist(checklist);
        return ResponseEntity.ok(createdChecklist);
    }
    @DeleteMapping(path="/deleteChecklist/{idChecklist}")
    public void deleteChecklist(@PathVariable Integer idChecklist){
        checklistService.deleteChecklist(idChecklist);
    }
    @GetMapping(path="/getChecklist")
    public List<Checklist> getAllChecklist(){
        return checklistService.getAllChecklist();
    }
    @PutMapping(path = "/updateChecklist/{idChecklist}")
    public Checklist updateChecklist(@RequestBody Checklist checklist, @PathVariable Integer idChecklist){
        return checklistService.updateChecklist(checklist,idChecklist);
    }
    @GetMapping(path="/getChecklistById/{idChecklist}")
    public Optional<Checklist> getChecklistById(@PathVariable("idChecklist") Integer idChecklist ) {
        return checklistService.getidChecklistById(idChecklist);
    }
}
