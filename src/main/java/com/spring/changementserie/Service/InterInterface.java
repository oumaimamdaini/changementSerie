package com.spring.changementserie.Service;

import com.spring.changementserie.Models.Interface;

import java.util.List;

public interface InterInterface {
    public void deleteInterface(Integer idInterface);
    public Interface createInterface(Interface interfaceObj);
    public List<Interface> getAllInterface();
}
