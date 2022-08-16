package com.example.a_new_hope.service.interfaces;

public interface Vehiculo {
    public Integer getId();

    public void setId(Integer id) ;

    public String getName() ;

    public void setName(String name) ;

    public String getTipo() ;

    public void setTipo(String tipo) ;

    public int getCostoEnCreditos() ;

    public void setCostoEnCreditos(int costoEnCreditos) ;

    public int getCapacidadDePasajeros() ;

    public void setCapacidadDePasajeros(int capacidadDePasajeros) ;

    public int getCapacidadDeCarga() ;

    public void setCapacidadDeCarga(int capacidadDeCarga) ;

    public int getVelocidadMaxima() ;

    public void setVelocidadMaxima(int velocidadMaxima) ;

    public int getMgltCategory() ;

    public void setMgltCategory(int mgltCategory) ;
}