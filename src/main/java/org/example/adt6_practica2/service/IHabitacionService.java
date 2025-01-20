package org.example.adt6_practica2.service;

import org.example.adt6_practica2.model.Habitacion;

import java.util.List;

public interface IHabitacionService {
    Habitacion registrarHabitacion(Habitacion habitacion);
    void deleteHabitacion(Integer id);
    Habitacion updateHabitacionOcupada(Integer id,boolean ocupado);
    List<Habitacion> listarPorHotel(Integer id_hotel);
    List<Habitacion> listarPorHotelOcupada(Integer id_hotel);
}
