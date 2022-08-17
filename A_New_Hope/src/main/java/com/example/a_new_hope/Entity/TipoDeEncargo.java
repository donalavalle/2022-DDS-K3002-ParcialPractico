package com.example.a_new_hope.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public interface TipoDeEncargo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id = 0;
    int obtenerPrecio();
}
