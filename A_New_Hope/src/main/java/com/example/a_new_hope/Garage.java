package com.example.a_new_hope;

public class Garage {
    private int capacidad;
    private Estado estado;
    private int reservasEfectuadas;

    public Garage(int capacidad) {
        this.capacidad = capacidad;
        this.reservasEfectuadas = 0;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void agregarReserva() {
        this.reservasEfectuadas += 1;
    }
    public boolean llegoALimite() {
        return reservasEfectuadas == capacidad;
    }

    public boolean efectuarReserva() {
        return estado.efectuarReserva(this);
    }

    public Boolean estadoDelGarage() {
        estado = llegoALimite() ? new EstadoCompeto() : new EstadoDisponible();
        return llegoALimite();
    }
}