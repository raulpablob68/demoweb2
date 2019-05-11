package com.demoweb.controller;

import com.demoweb.model.Persona;
import com.demoweb.service.IPersonaService;

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
public class PersonaController {
  @Autowired
  IPersonaService personaService;

  @GetMapping("/myapi/1.0/personas")
  public List<Persona> getAllPersonas() {
    return personaService.getAll();
  }

  @GetMapping("/myapi/1.0/personas/{idPersona}")
  public Persona getOne(@PathVariable(value = "idPersona") int idPersona) {
    return personaService.get(idPersona);
  }

  @PostMapping("/myapi/1.0/personas")
  public void add(@RequestBody Persona persona) {
    personaService.post(persona);
  }

  @PutMapping("/myapi/1.0/personas/{idPersona}")
  public void update(@RequestBody Persona persona, @PathVariable int idPersona) {
    personaService.put(persona, idPersona);
  }
  
  @DeleteMapping(value = "/myapi/1.0/personas/{idPersona}")
  public void eliminar(@PathVariable Integer idPersona) {
    personaService.delete(idPersona);
  }
}
