package com.demoweb.service;

import com.demoweb.model.Usuario;

import java.util.List;

public interface IUsuarioService {
  public Usuario get(String nombre);

  public List<Usuario> getAll();

  public void post(Usuario usuario);

  public void put(Usuario usuario, int idUsuario);

  public void delete(int idUsuario);
}
