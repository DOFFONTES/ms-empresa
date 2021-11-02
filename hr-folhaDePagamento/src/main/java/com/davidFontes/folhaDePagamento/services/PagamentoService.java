package com.davidFontes.folhaDePagamento.services;

import org.springframework.stereotype.Service;

import com.davidFontes.folhaDePagamento.entities.Pagamento;

@Service
public class PagamentoService {

	public Pagamento getPagamento(Long trabalhadorId, int dias) {
		return new Pagamento("Bob", 200.0, dias);
	}
}
