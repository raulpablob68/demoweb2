package com.demoweb.service;

import com.demoweb.dao.IPersonaDao;
import com.demoweb.model.Persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService {

  @Autowired
  private IPersonaDao personaDao;

  @Override
  public Persona get(int idPersona) {
    return personaDao.findById(idPersona).get();
  }

  @Override
  public List<Persona> getAll() {
    return (List<Persona>) personaDao.findAll();
  }

  @Override
  public void post(Persona persona) {
    personaDao.save(persona);
  }

  @Override
  public void put(Persona persona, int idPersona) {
    personaDao.findById(idPersona).ifPresent((l) -> {
      persona.setIdPersona(idPersona);
      personaDao.save(persona);
    });
  }

  @Override
  public void delete(int idPersona) {
    personaDao.deleteById(idPersona);
  }
}
