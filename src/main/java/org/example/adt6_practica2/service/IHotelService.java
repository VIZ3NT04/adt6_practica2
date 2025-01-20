package org.example.adt6_practica2.service;

import org.example.adt6_practica2.model.Hotel;

import java.util.List;

public interface IHotelService {
    Hotel registrarHotel (Hotel hotel);
    List<Hotel> buscarHoteles();
    List<Hotel> listarLocaCate(String categoria , String localidad);
}
