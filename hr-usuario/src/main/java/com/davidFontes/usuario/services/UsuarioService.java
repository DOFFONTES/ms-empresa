package com.davidFontes.usuario.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidFontes.usuario.entities.Usuario;
import com.davidFontes.usuario.repositories.UsuarioRepository;
import com.davidFontes.usuario.services.exception.ObjetoNaoEncontradoException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;
	
	public Usuario buscaPorEmail(String email) {
		Usuario obj = repo.findByEmailIgnoreCase(email);
		if(obj == null) {
			throw new ObjetoNaoEncontradoException("Objeto não encontrado");
		}
		return obj;
	}
	
	public Usuario buscaPorId(Long id) {
		Optional<Usuario> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoNaoEncontradoException("Objeto não encontrado"));
	}
}





