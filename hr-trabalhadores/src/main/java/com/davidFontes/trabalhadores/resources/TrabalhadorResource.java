package com.davidFontes.trabalhadores.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidFontes.trabalhadores.entities.Trabalhador;
import com.davidFontes.trabalhadores.services.TrabalhadoresService;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResource {

	@Autowired
	TrabalhadoresService trabalhadoresService;
	
	@GetMapping
	public ResponseEntity<List<Trabalhador>> buscaTodos() {
		
		return ResponseEntity.ok(trabalhadoresService.buscaTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Trabalhador> buscaPorId(@PathVariable Long id) {
		
		return ResponseEntity.ok(trabalhadoresService.buscaPorId(id));
	}
}
