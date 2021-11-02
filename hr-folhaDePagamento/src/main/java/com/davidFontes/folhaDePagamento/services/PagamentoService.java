package com.davidFontes.folhaDePagamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidFontes.folhaDePagamento.entities.Pagamento;
import com.davidFontes.folhaDePagamento.entities.Trabalhador;
import com.davidFontes.folhaDePagamento.feignclients.TrabalhadorFeignClient;

@Service
public class PagamentoService {
	
	@Autowired
	TrabalhadorFeignClient trabalhadorFeignClient;

	public Pagamento getPagamento(Long trabalhadorId, int dias) {
		
		Trabalhador trabalhador = trabalhadorFeignClient.buscaPorId(trabalhadorId).getBody();
				
		return new Pagamento(trabalhador.getNome(), trabalhador.getRendaDiaria(), dias);
	}
}








