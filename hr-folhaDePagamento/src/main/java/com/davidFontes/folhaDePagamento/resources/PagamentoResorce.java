package com.davidFontes.folhaDePagamento.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidFontes.folhaDePagamento.entities.Pagamento;
import com.davidFontes.folhaDePagamento.services.PagamentoService;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoResorce {

	
	@Autowired
	private PagamentoService pagamentoService;
	
	@GetMapping("/{trabalhadorId}/dias/{dias}")
	public ResponseEntity<Pagamento> buscaPagamento(@PathVariable Long trabalhadorId, @PathVariable Integer dias) {
		return ResponseEntity.ok(pagamentoService.getPagamento(trabalhadorId, dias));
	}
}
