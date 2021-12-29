package com.davidFontes.trabalhador.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidFontes.trabalhador.entities.Trabalhador;
import com.davidFontes.trabalhador.services.TrabalhadoresService;

@RefreshScope
@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResource {
	
//	private static Logger logger = LoggerFactory.getLogger(TrabalhadorResource.class);
	
//	@Value("${test.config}")
//	private String testConfig;
	
//	@Autowired
//	private Environment env;

	@Autowired
	TrabalhadoresService trabalhadoresService;
	
	@GetMapping
	public ResponseEntity<List<Trabalhador>> buscaTodos() {
		
		return ResponseEntity.ok(trabalhadoresService.buscaTodos());
	}
	
	@GetMapping(value = "/config")
	public ResponseEntity<Void> buscaConfig() {
		
		//logger.info("Configuração: " + testConfig);
		
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Trabalhador> buscaPorId(@PathVariable Long id) {

	//	logger.info("PORT = " + env.getProperty("local.server.port"));
		
		return ResponseEntity.ok(trabalhadoresService.buscaPorId(id));
	}
}
