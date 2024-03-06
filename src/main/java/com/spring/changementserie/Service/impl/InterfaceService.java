package com.spring.changementserie.Service.impl;

import com.spring.changementserie.Models.Interface;
import com.spring.changementserie.Repository.InterfaceRepository;
import com.spring.changementserie.Service.InterInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InterfaceService implements InterInterface {
    @Autowired
    private InterfaceRepository interfaceRepository;


    @Override
    public Interface createInterface(Interface interfaceObj) {
        return interfaceRepository.save(interfaceObj);
    }
    @Override
    public void deleteInterface(Integer idInterface) {
        interfaceRepository.deleteById(idInterface);
    }

    @Override
    public List<Interface> getAllInterface() {
        return interfaceRepository.findAll();
    }
}
