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
@Table(name = "jutsu")
public class Jutsu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    /*
     * Armazena o enum como texto
     * */
    @Enumerated(EnumType.STRING)
    private Elementos elemento;

    @ManyToMany(mappedBy = "jutsus")
    private List<Ninja> ninjas;

}
