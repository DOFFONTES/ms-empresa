package com.davidFontes.folhaDePagamento.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.davidFontes.folhaDePagamento.entities.Trabalhador;

@Component
@FeignClient(name = "hr-trabalhador", url = "http://localhost:8001", path = "/trabalhadores")
public interface TrabalhadorFeignClient {

	@GetMapping("/{id}")
	ResponseEntity<Trabalhador> buscaPorId(@PathVariable Long id);
}
