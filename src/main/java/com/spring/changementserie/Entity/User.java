package com.spring.changementserie.Entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="user")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name="id", length=45)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name="nom",length = 255)
    private String nom;
    @Column(name="login",length=255)
    private String login;
    @Column(name="password",length = 255)
    private String password;
    @ManyToOne
    private Profil profil;


    public User(int id, String nom, String login, String encode) {
    }
}
