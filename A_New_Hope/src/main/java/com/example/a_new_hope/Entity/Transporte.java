package com.example.a_new_hope.Entity;


import com.example.a_new_hope.service.interfaces.Vehiculo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "VEHICULOS")
public class Transporte implements Vehiculo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String tipo;
    private int costoEnCreditos;
    private int capacidadDePasajeros;
    private int capacidadDeCarga;
    private int velocidadMaxima;
    private int mgltCategory;
    private String name;
    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getTipo() {
        return tipo;
    }
    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public int getCostoEnCreditos() {
        return costoEnCreditos;
    }
    @Override
    public void setCostoEnCreditos(int costoEnCreditos) {
        this.costoEnCreditos = costoEnCreditos;
    }
    @Override
    public int getCapacidadDePasajeros() {
        return capacidadDePasajeros;
    }
    @Override
    public void setCapacidadDePasajeros(int capacidadDePasajeros) {
        this.capacidadDePasajeros = capacidadDePasajeros;
    }
    @Override
    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }
    @Override
    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }
    @Override
    public int getVelocidadMaxima() {
        return -1;
    }
    @Override
    public void setVelocidadMaxima(int velocidadMaxima) {}
    @Override
    public int getMgltCategory() {
        return -1;
    }
    @Override
    public void setMgltCategory(int mgltCategory) {}
}