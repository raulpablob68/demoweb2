package com.demoweb.dao;

import com.demoweb.model.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Integer> {
  Usuario findByNombre(String nombre);
}
