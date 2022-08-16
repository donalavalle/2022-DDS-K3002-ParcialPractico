package com.example.a_new_hope.Entity;

import com.example.a_new_hope.service.interfaces.Servicio;
import com.example.a_new_hope.service.interfaces.TipoDeEncargo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


public class Encargo extends Servicio {
    private String nombreEncargo;
    public Encargo() {}
    public String getEncargo() { return nombreEncargo; }

    public void setEncargo(String encargo) {
        this.nombreEncargo = encargo;
    }
    private  TipoDeEncargo tipoDeEncargo;


    // Metodos
    @Override
    public int obtenerPrecio() {
        return tipoDeEncargo.obtenerPrecio();
    }

    public void setTipoDeEncargo(TipoDeEncargo tipoDeEncargo) {
        this.tipoDeEncargo = tipoDeEncargo;
    }
}