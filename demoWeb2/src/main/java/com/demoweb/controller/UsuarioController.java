package com.demoweb.controller;

import com.demoweb.model.Usuario;
import com.demoweb.service.IUsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
  @Autowired
  IUsuarioService usuarioService;

  @GetMapping("/myapi/1.0/usuarios")
  public List<Usuario> getAllPersonas() {
    return usuarioService.getAll();
  }

  @GetMapping("/myapi/1.0/usuarios/{nombre}")
  public Usuario getOne(@PathVariable(value = "nombre") String nombre) {
    return usuarioService.get(nombre);
  }

  @PostMapping("/myapi/1.0/usuarios")
  public void add(@RequestBody Usuario usuario) {
    usuarioService.post(usuario);
  }

  @PutMapping("/myapi/1.0/usuarios/{idUsuario}")
  public void update(@RequestBody Usuario usuario, @PathVariable int idUsuario) {
    usuarioService.put(usuario, idUsuario);
  }
  
  @DeleteMapping(value = "/myapi/1.0/usuarios/{idUsuario}")
  public void eliminar(@PathVariable Integer idUsuario) {
    usuarioService.delete(idUsuario);
  }
}
