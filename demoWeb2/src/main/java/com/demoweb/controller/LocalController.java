package com.demoweb.controller;

import com.demoweb.model.Local;
import com.demoweb.service.ILocalService;

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
public class LocalController {
  @Autowired
  ILocalService localService;

  @GetMapping("/api/1.0/locales/")
  public List<Local> getAllLocales() {
    return localService.getAll();
  }

  @GetMapping("/api/1.0/locales/{idLocal}")
  public Local getOne(@PathVariable(value = "idLocal") int idLocal) {
    return localService.get(idLocal);
  }

  @PostMapping("/api/1.0/locales/")
  public void add(@RequestBody Local local) {
    localService.post(local);
  }

  @PutMapping("/api/1.0/locales/{idLocal}")
  public void update(@RequestBody Local local, @PathVariable int idLocal) {
    localService.put(local, idLocal);
  }
  
  @DeleteMapping(value = "/api/1.0/locales/{idLocal}")
  public void eliminar(@PathVariable Integer idLocal) {
    localService.delete(idLocal);
  }
}
