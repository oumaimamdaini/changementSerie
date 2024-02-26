package com.spring.changementserie.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
public class User implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name="nom")
    private String nom;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "profil_id")
    private Profil profil;


    public User(int id, String nom, String email, String encode) {
    }

}
