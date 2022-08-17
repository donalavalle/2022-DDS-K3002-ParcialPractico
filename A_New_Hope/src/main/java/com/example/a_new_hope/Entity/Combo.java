package com.example.a_new_hope.Entity;


import javax.persistence.*;
import java.util.ArrayList;
@Entity
@Table(name = "COMBO")
public class Combo extends Servicio {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    private String nombreArticulo;
    @OneToMany
    private ArrayList<Servicio> serviciosDelCombo = new ArrayList<>();

    // Getters and Setters
    public void agregarServicio(Servicio nuevoServicio) {
        serviciosDelCombo.add(nuevoServicio);
    }

    public void quitarServicio(Servicio ServicioASacar) {
        serviciosDelCombo.remove(ServicioASacar);
    }

    public String getArticulo() { return nombreArticulo; }

    public void setArticulo(String articulo) {
        this.nombreArticulo = articulo;
    }

    public ArrayList obtenerServiciosDelCombo() {
        ArrayList<String> nombreServicios = new ArrayList<>();
        for (Servicio servicio : serviciosDelCombo) {
            nombreServicios.add(servicio.getArticulo());
        }
        return nombreServicios;
    }

    // Constructor
    public Combo() {}

    public Combo(ArrayList<Servicio> serviciosDelCombo) {
        this.serviciosDelCombo = serviciosDelCombo;
    }

    // Metodos
    @Override
    public int obtenerPrecio() {
        int precioTotal = 0;
        for (Servicio servicio : serviciosDelCombo) {
            precioTotal += servicio.obtenerPrecio();
        }
        return precioTotal;
        }

}