package com.demoweb.service;

import com.demoweb.dao.IUsuarioDao;
import com.demoweb.model.Usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

  @Autowired
  private IUsuarioDao usuarioDao;

  @Override
  public Usuario get(String nombre) {
    return usuarioDao.findByNombre(nombre);
  }

  @Override
  public List<Usuario> getAll() {
    return (List<Usuario>) usuarioDao.findAll();
  }

  @Override
  public void post(Usuario usuario) {
    usuarioDao.save(usuario);
  }

  @Override
  public void put(Usuario usuario, int idUsuario) {
    usuarioDao.findById(idUsuario).ifPresent((l) -> {
      usuario.setIdUsuario(idUsuario);
      usuarioDao.save(usuario);
    });
  }

  @Override
  public void delete(int idUsuario) {
    usuarioDao.deleteById(idUsuario);
  }
}
