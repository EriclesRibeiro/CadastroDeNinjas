package com.ninjas.CadastroDeNinjas.infrastructure.repositories;

import com.ninjas.CadastroDeNinjas.infrastructure.entities.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> { }
