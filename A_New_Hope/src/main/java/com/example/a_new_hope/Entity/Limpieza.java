package com.example.a_new_hope.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ENCARGOS")
public class Limpieza implements TipoDeEncargo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    public Limpieza() {

    }

    public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
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
