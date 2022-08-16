package com.example.a_new_hope.service.imp;

import com.example.a_new_hope.Entity.Nave;
import com.example.a_new_hope.Entity.Transporte;
import com.example.a_new_hope.service.interfaces.Vehiculo;
import com.example.a_new_hope.Api;


public abstract class VehiculoFactory {
    Api interfazApi = Api.getInstance();
    public Vehiculo createVehiculo(String type, String name)
    {
        String [] dato;
        if (type == null || type.isEmpty())
            return null;

        switch (type) {
            case "Nave":
                dato = interfazApi.nave(name);
                Nave nave = new Nave();
                nave.setCostoEnCreditos(Integer.parseInt(dato[0]));
                nave.setCapacidadDePasajeros(Integer.parseInt(dato[1]));
                nave.setCapacidadDeCarga(Integer.parseInt(dato[2]));
                nave.setVelocidadMaxima(Integer.parseInt(dato[3]));
                nave.setMgltCategory(Integer.parseInt(dato[4]));
                nave.setName(name);
                nave.setTipo(type);
                return nave;

            case "Transporte":
                dato = interfazApi.transporte(name);
                Transporte transp = new Transporte();
                transp.setCostoEnCreditos(Integer.parseInt(dato[0]));
                transp.setCapacidadDePasajeros(Integer.parseInt(dato[1]));
                transp.setCapacidadDeCarga(Integer.parseInt(dato[2]));
                transp.setName(name);
                transp.setTipo(type);
                return transp;

            default:
                throw new IllegalArgumentException("Unknown type "+type);
        }
    }
}