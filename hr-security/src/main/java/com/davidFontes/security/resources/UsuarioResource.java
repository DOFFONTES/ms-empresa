package com.davidFontes.security.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.davidFontes.security.entities.Usuario;
import com.davidFontes.security.services.UsuarioService;

@RestController
@RequestMapping(value= "/security/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioService service;
	
	@GetMapping(value = "/pesquisa")
	public ResponseEntity<Usuario> buscaPorEmail(@RequestParam String email) {
		try {
			Usuario usuario = service.buscaPorEmail(email);
			return ResponseEntity.ok(usuario);
		}
		catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
}


