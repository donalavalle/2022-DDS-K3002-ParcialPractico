package com.example.a_new_hope.Entity;

import com.example.a_new_hope.Entity.Servicio;
import com.example.a_new_hope.Garage;

import javax.persistence.*;

@Entity
@Table(name = "RESERVAS")
public class Reserva {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @OneToOne
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