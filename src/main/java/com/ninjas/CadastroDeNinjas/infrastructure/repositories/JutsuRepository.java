package com.ninjas.CadastroDeNinjas.infrastructure.repositories;

import com.ninjas.CadastroDeNinjas.infrastructure.entities.Jutsu;
import com.ninjas.CadastroDeNinjas.infrastructure.enums.Elementos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JutsuRepository extends JpaRepository<Jutsu, Long> {

    List<Jutsu> findByElemento(Elementos elemento);

}
