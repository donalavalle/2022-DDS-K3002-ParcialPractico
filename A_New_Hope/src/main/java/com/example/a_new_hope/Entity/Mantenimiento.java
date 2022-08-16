package com.example.a_new_hope.Entity;

import com.example.a_new_hope.service.interfaces.TipoDeEncargo;

public abstract class Mantenimiento implements TipoDeEncargo {
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
