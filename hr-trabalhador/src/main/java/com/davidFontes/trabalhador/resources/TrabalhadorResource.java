package com.davidFontes.trabalhador.resources;

import java.util.List;

import org.springframework.core.env.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidFontes.trabalhador.entities.Trabalhador;
import com.davidFontes.trabalhador.services.TrabalhadoresService;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResource {
	
	private static Logger logger = LoggerFactory.getLogger(TrabalhadorResource.class);
	
	@Autowired
	private Environment env;

	@Autowired
	TrabalhadoresService trabalhadoresService;
	
	@GetMapping
	public ResponseEntity<List<Trabalhador>> buscaTodos() {
		
		return ResponseEntity.ok(trabalhadoresService.buscaTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Trabalhador> buscaPorId(@PathVariable Long id) {

		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		return ResponseEntity.ok(trabalhadoresService.buscaPorId(id));
	}
}
