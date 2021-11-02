package com.davidFontes.trabalhador.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidFontes.trabalhador.entities.Trabalhador;
import com.davidFontes.trabalhador.repositories.TrabalhadorRepository;

@Service
public class TrabalhadoresService {

	
	@Autowired
	TrabalhadorRepository repo;
	
	public List<Trabalhador> buscaTodos(){
		
		return repo.findAll();
		
	}
	
	public Trabalhador buscaPorId(Long id){
		
		return repo.findById(id).get();
		
	}
	
}
