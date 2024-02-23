package com.spring.changementserie.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "profil")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Profil {
    @Id
    @Column(nullable = false,name="id")

    private int id;
    @OneToMany(mappedBy = "profil",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "profil_id")
    private List<User> users;
}
