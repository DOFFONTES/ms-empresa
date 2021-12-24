package com.davidFontes.security.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidFontes.security.entities.Usuario;
import com.davidFontes.security.feignclients.UsuarioFeignClient;

@Service
public class UsuarioService {

	private static Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	private UsuarioFeignClient usuarioFeignClient;
	
	public Usuario buscaPorEmail(String email) {
		Usuario usuario = usuarioFeignClient.buscaPorEmail(email).getBody();
		if (usuario == null) {
			logger.error("Email não encontrado: " + email);
			throw new IllegalArgumentException("Email não encontrado");
		}
		logger.info("Email found: " + email);
		return usuario;
	}

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Usuario user = usuarioFeignClient.buscaPorEmail(username).getBody();
//		if (user == null) {
//			logger.error("Email not found: " + username);
//			throw new UsernameNotFoundException("Email not found");
//		}
//		logger.info("Email found: " + username);
//		return user;
//		
//		implements UserDetailsService
//	}

}


