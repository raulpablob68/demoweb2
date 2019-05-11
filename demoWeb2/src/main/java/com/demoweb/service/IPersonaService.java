package com.demoweb.service;

import com.demoweb.model.Persona;

import java.util.List;

public interface IPersonaService {
  public Persona get(int idPersona);

  public List<Persona> getAll();

  public void post(Persona persona);

  public void put(Persona persona, int idPersona);

  public void delete(int idPersona);
}
