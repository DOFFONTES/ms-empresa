package com.davidFontes.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
//(exclude = {SecurityAutoConfiguration.class})
public class HrSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrSecurityApplication.class, args);
	}

}
