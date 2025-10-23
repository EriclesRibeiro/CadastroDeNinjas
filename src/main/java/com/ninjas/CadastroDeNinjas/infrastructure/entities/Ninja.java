package com.ninjas.CadastroDeNinjas.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ninja")
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    /*
    * Relacionamento OneToMany, pois um ninja pode ter vários jutsus
    * */
    @OneToMany(mappedBy = "ninja", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Jutsu> jutsus;

    /*
    * Relacionamento ManyToOne, pois vários ninjas podem pertencer a uma aldeia
    * */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_aldeia")
    private Aldeia aldeia;

}