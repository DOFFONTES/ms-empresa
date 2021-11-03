package com.davidFontes.folhaDePagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class HrFolhaDePagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrFolhaDePagamentoApplication.class, args);
	}

}
