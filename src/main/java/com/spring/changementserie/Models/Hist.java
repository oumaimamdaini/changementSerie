package com.spring.changementserie.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "histconnexion")
public class Hist implements Serializable {
    @Id
    private int idHist;

}
