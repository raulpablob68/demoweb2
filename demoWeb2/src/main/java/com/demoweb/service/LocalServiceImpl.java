package com.demoweb.service;

import com.demoweb.dao.ILocalDao;
import com.demoweb.model.Local;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalServiceImpl implements ILocalService {

  @Autowired
  private ILocalDao localDao;

  @Override
  public Local get(int idLocal) {
    return localDao.findById(idLocal).get();
  }

  @Override
  public List<Local> getAll() {
    return (List<Local>) localDao.findAll();
  }

  @Override
  public void post(Local local) {
    localDao.save(local);
  }

  @Override
  public void put(Local local, int idLocal) {
    localDao.findById(idLocal).ifPresent((l) -> {
      local.setIdLocal(idLocal);
      localDao.save(local);
    });
  }

  @Override
  public void delete(int idLocal) {
    localDao.deleteById(idLocal);
  }
}
