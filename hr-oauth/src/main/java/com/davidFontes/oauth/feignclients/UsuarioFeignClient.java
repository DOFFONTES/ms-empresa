package com.davidFontes.oauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.davidFontes.oauth.entities.Usuario;

@Component
@FeignClient(name= "hr-usuario", path = "/usuarios")
public interface UsuarioFeignClient {

    @GetMapping(value = "/pesquisa")
    ResponseEntity<Usuario> buscaPorEmail(@RequestParam String email);
}
