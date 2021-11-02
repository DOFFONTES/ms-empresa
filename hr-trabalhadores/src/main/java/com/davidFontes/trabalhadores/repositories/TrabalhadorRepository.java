package com.davidFontes.trabalhadores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidFontes.trabalhadores.entities.Trabalhador;

@Repository
public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long>{

}
