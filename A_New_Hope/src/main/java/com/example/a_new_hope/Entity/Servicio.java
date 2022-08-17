package com.example.a_new_hope.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Servicio {

    private String encargo;
    private int id;

    public String getArticulo() { return encargo; }
    public int obtenerPrecio(){ return 0; }
    public void setArticulo(String articulo) { this.encargo = articulo; }


    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }
}
