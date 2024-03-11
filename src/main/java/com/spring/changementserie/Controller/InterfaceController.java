package com.spring.changementserie.Controller;


import com.spring.changementserie.Models.Interface;
import com.spring.changementserie.Service.impl.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @PutMapping(path = "/updateInterface/{idInterface}")
    public Interface updateInterface(@RequestBody Interface interfaceObj, @PathVariable Integer idInterface){
        return interfaceService.updateInterface(interfaceObj,idInterface);
    }
    @GetMapping(path="/getInterfaceById/{idInterface}")
    public Optional<Interface> getInterfaceById(@PathVariable("idInterface") Integer idInterface ) {
        return interfaceService.getCInterfaceById(idInterface);
    }


}
