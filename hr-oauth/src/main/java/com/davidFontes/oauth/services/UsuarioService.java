package com.davidFontes.oauth.services;

import com.davidFontes.oauth.entities.Usuario;
import com.davidFontes.oauth.feignclients.UsuarioFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {

    Logger logger = LoggerFactory.getLogger(UsuarioService.class);

    @Autowired
    UsuarioFeignClient feignClient;

    public Usuario buscaPorEmail(String email) {

        Usuario obj = feignClient.buscaPorEmail(email).getBody();

        if(obj == null){
            logger.error("Email não encontrado: " + email);
            throw new IllegalArgumentException("Email não encontrado");
        }
        logger.info("Email encontrado: " + email);
        return obj;
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario user = feignClient.buscaPorEmail(username).getBody();
		if (user == null) {
			logger.error("Email not found: " + username);
			throw new UsernameNotFoundException("Email not found");
		}
		logger.info("Email found: " + username);
		return user;
		
	}
}
