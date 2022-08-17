package com.example.a_new_hope.Entity;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
@Entity

public class Encargo extends Servicio {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    private String nombreEncargo;
    public Encargo() {}
    public String getEncargo() { return nombreEncargo; }

    public void setEncargo(String encargo) {
        this.nombreEncargo = encargo;
    }
    @OneToOne
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