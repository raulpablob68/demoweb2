package com.demoweb.dao;

import com.demoweb.model.Local;

import org.springframework.data.repository.CrudRepository;

public interface ILocalDao extends CrudRepository<Local, Integer> {

}
