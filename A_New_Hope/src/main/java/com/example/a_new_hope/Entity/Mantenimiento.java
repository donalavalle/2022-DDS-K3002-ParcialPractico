package com.example.a_new_hope.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Mantenimiento implements TipoDeEncargo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Mantenimiento(){};
    private int precioEstandar;

    public int getPrecioEstandar() {
        return precioEstandar;
    }

    public void setPrecioEstandar(int precio) {
        this.precioEstandar = precio;
    }
    public Mantenimiento(int precioEstandar) { this.precioEstandar = precioEstandar; }

    public abstract int obtenerPrecio();
}
