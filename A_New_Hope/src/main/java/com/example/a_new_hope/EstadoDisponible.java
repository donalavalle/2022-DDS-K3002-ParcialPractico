package com.example.a_new_hope;

public class EstadoDisponible extends Estado {
    @Override
    public boolean efectuarReserva(Garage garage) {
        garage.agregarReserva();
        if(garage.llegoALimite()) {
            garage.setEstado(new EstadoCompeto());
        }
        return true;
    }
}

