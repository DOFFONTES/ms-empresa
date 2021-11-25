package com.davidFontes.usuario.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.davidFontes.usuario.dto.UsuarioDTO;
import com.davidFontes.usuario.entities.Usuario;
import com.davidFontes.usuario.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UsuarioDTO> buscaPorId(@PathVariable Long id) {
		
		Usuario obj = usuarioService.buscaPorId(id);
		
		
		return ResponseEntity.ok(new UsuarioDTO(obj));
	}
	
	@GetMapping("/pesquisa")
	public ResponseEntity<Usuario> buscaPorEmail(@RequestParam String email) {
		
		Usuario obj = usuarioService.buscaPorEmail(email);
		
		return ResponseEntity.ok(obj);
	}
}














