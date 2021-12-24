package com.davidFontes.oauth.resources;

import com.davidFontes.oauth.entities.Usuario;
import com.davidFontes.oauth.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/oauth/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService service;

    @GetMapping("/pesquisa")
    public ResponseEntity<Usuario> buscaPorEmail(@RequestParam String email) {

        try{
            Usuario obj = service.buscaPorEmail(email);
            return ResponseEntity.ok(obj);
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
