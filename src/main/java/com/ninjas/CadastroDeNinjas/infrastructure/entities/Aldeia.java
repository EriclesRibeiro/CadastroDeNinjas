package com.ninjas.CadastroDeNinjas.infrastructure.entities;

import com.ninjas.CadastroDeNinjas.infrastructure.enums.Elementos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "aldeia")
public class Aldeia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
    * Armazena o enum como texto
    * */
    @Enumerated(EnumType.STRING)
    private Elementos elemento;

    private String nome;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_lider")
    private Ninja lider;

    /*
     * Relacionamento OneToMany, pois uma aldeia pode ter vários ninjas
     * */
    @OneToMany(mappedBy = "aldeia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ninja> ninjas;

}
