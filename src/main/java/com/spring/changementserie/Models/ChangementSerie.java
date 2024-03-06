package com.spring.changementserie.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Changement_Serie")
public class ChangementSerie {
    @Id
    @Column(name = "id")
    private Integer idChserie;
    @Column(name = "Description")
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Date")
    private Date dateChangement;
}
