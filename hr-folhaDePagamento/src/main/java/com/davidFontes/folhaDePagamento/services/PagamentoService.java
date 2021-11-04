package com.davidFontes.folhaDePagamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidFontes.folhaDePagamento.entities.Pagamento;
import com.davidFontes.folhaDePagamento.entities.Trabalhador;
import com.davidFontes.folhaDePagamento.feignclients.TrabalhadorFeignClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class PagamentoService {
	
	private static final String PAGAMENTO_SERVICE = "pagamentoService";
	private static final String FALLBACK_METHOD = "fallback";
	
	@Autowired
	TrabalhadorFeignClient trabalhadorFeignClient;

	@CircuitBreaker(name = PAGAMENTO_SERVICE,fallbackMethod = FALLBACK_METHOD)
	public Pagamento getPagamento(Long trabalhadorId, int dias) {
		
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Trabalhador trabalhador = trabalhadorFeignClient.buscaPorId(trabalhadorId).getBody();
				
		return new Pagamento(trabalhador.getNome(), trabalhador.getRendaDiaria(), dias);
	}
	
	public Pagamento fallback(Exception ex) {
				
		return new Pagamento("David", 500.0, 5);
	}  
}








