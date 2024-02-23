package com.spring.changementserie.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "histconnexion")
public class Hist {
    @Id
    private int idHist;

}
