package com.davidFontes.security.protection;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil {

	@Value("${TOKEN_SENHA}")
	private String senha;
	
	@Value("${TOKEN_EXPIRACAO}")
	private Long espiracao;
	
	public String generateToken(String username) {
		return Jwts.builder()
				   .setSubject(username)
				   .setExpiration(new Date(System.currentTimeMillis() + espiracao))
				   .signWith(SignatureAlgorithm.HS512, senha.getBytes())
				   .compact();
	}
}
