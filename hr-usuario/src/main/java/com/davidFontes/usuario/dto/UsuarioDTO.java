package com.davidFontes.usuario.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.davidFontes.usuario.entities.Perfil;
import com.davidFontes.usuario.entities.Usuario;

public class UsuarioDTO  implements Serializable{
		private static final long serialVersionUID = 1L;
		
		private Long id;
		private String nome;
		private String email;
		private String senha;
		
		private Set<Perfil> perfis = new HashSet<>();
		
		public UsuarioDTO() {
		}
		
		public UsuarioDTO(Usuario obj) {
			this.id = obj.getId();
			this.nome = obj.getNome();
			this.email = obj.getEmail();
			this.senha = obj.getSenha();
			this.perfis.addAll(obj.getPerfis());
		}

		public Set<Perfil> getPerfis() {
			return perfis;
		}

		public void setPerfis(Set<Perfil> perfis) {
			this.perfis = perfis;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}
		
}
