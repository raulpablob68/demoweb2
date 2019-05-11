package com.demoweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Local {
  @Id
  private int idLocal;
  @Column(name = "nomLocal", length = 50)
  private String nomLocal;
  @Column(name = "descripLocal", length = 250)
  private String descripLocal;

  public int getIdLocal() {
    return idLocal;
  }

  public void setIdLocal(int idLocal) {
    this.idLocal = idLocal;
  }

  public String getNomLocal() {
    return nomLocal;
  }

  public void setNomLocal(String nomLocal) {
    this.nomLocal = nomLocal;
  }

  public String getDescripLocal() {
    return descripLocal;
  }

  public void setDescripLocal(String descripLocal) {
    this.descripLocal = descripLocal;
  }
}
