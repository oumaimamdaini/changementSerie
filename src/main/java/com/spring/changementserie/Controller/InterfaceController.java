package com.spring.changementserie.Controller;

import com.spring.changementserie.Models.Checklist;
import com.spring.changementserie.Models.Interface;
import com.spring.changementserie.Service.impl.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/interface")
public class InterfaceController {
    @Autowired
    private InterfaceService interfaceService;
    @PostMapping(path="/createInterface")
    public ResponseEntity<Interface> createInterface(@RequestBody Interface interfaceObj)
    {   Interface createdInterface = interfaceService.createInterface(interfaceObj);
        return ResponseEntity.ok(createdInterface);
    }
    @DeleteMapping(path="/deleteInterface/{idInterface}")
    public void deleteInterface(@PathVariable Integer idInterface){
        interfaceService.deleteInterface(idInterface);
    }
    @GetMapping(path="/getInterface")
    public List<Interface> getAllInterface(){
        return interfaceService.getAllInterface();
    }
}
