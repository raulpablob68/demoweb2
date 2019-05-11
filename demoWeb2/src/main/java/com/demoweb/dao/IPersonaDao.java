package com.demoweb.dao;

import com.demoweb.model.Persona;

import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Integer> {

}
