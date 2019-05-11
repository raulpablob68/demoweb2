package com.demoweb.service;

import com.demoweb.model.Local;

import java.util.List;

public interface ILocalService {
  public Local get(int idLocal);

  public List<Local> getAll();

  public void post(Local local);

  public void put(Local local, int idLocal);

  public void delete(int idLocal);
}
