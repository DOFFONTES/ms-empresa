package com.davidFontes.trabalhador.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidFontes.trabalhador.entities.Trabalhador;

@Repository
public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long>{

}
