package com.example.a_new_hope;

import com.example.a_new_hope.service.interfaces.Servicio;

import java.util.ArrayList;

public class Reserva {
    private Servicio serviciosElegidos;

    // Getters and Setters

    public void agregarServicios(Servicio servicio) { this.serviciosElegidos = servicio; }


    public Boolean efectuarReserva(Garage garage) {
        return  garage.efectuarReserva();
    }

    public int obtenerPrecioFinal() {
        return serviciosElegidos.obtenerPrecio();
    }
}