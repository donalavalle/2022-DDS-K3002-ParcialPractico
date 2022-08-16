package com.example.a_new_hope.Entity;

import com.example.a_new_hope.service.interfaces.TipoDeEncargo;

public class Limpieza implements TipoDeEncargo {
    private int precio;
    private int cantidadDePasajerosDeLaNave;
    public Limpieza(int cantidadDePasajerosDeLaNave) {
        this.cantidadDePasajerosDeLaNave = cantidadDePasajerosDeLaNave;
    }

    @Override
    public int obtenerPrecio() {
        return this.precio * cantidadDePasajerosDeLaNave;
    }
}
