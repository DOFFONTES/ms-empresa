package com.davidFontes.folhaDePagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrFolhaDePagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrFolhaDePagamentoApplication.class, args);
	}

}
