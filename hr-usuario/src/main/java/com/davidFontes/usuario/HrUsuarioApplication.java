package com.davidFontes.usuario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrUsuarioApplication implements CommandLineRunner{

	//@Autowired
	//private BCryptPasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(HrUsuarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	System.out.println("BCrypt: " + passwordEncoder.encode("123456"));
	}

}
