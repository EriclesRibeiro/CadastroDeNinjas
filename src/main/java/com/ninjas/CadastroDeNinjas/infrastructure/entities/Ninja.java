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
    * Relacionamento ManyToMany, pois um ninja pode ter vários jutsus e um jutsu pode estar em vários ninjas
    * @JoinTable para criar a tabela de relacionamento
    * */
    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "ninja_jutsu",
            joinColumns = @JoinColumn(name = "fk_ninja"),
            inverseJoinColumns = @JoinColumn(name = "fk_jutsu")
    )
    private List<Jutsu> jutsus;

    /*
    * Relacionamento ManyToOne, pois vários ninjas podem pertencer a uma aldeia
    * */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_aldeia")
    private Aldeia aldeia;

}