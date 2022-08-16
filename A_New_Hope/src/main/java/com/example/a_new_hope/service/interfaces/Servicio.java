package com.example.a_new_hope.service.interfaces;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Servicio {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String encargo;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getArticulo() { return encargo; }
    public int obtenerPrecio(){ return 0; }
    public void setArticulo(String articulo) { this.encargo = articulo; }


}
