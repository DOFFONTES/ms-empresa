package com.davidFontes.trabalhador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrTrabalhadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrTrabalhadorApplication.class, args);
	}

}
