package org.example.adt6_practica2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer tamano;

    private String precio;

    private boolean desayuno;

    private boolean ocupada;

    private Integer id_hotel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    public boolean isDesayuno() {
        return desayuno;
    }

    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Habitacion() {
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Habitacion(Integer id, Integer tamano, String precio, boolean desayuno, boolean ocupada, Integer id_hotel) {
        this.id = id;
        this.tamano = tamano;
        this.precio = precio;
        this.desayuno = desayuno;
        this.ocupada = ocupada;
        this.id_hotel = id_hotel;
    }

    public Integer getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(Integer id_hotel) {
        this.id_hotel = id_hotel;
    }
}
