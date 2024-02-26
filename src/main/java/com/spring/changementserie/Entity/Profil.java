package com.spring.changementserie.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "profil")
public class Profil implements Serializable {
    @Id
    @Column(nullable = false,name="id")

    private int id;
    @OneToMany(mappedBy = "profil")
    private List<User> users;
}
