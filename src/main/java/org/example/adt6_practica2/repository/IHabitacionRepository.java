package org.example.adt6_practica2.repository;

import org.example.adt6_practica2.model.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface IHabitacionRepository extends JpaRepository<Habitacion, Integer> {
    @Modifying
    @Query("FROM Habitacion h WHERE h.id_hotel = :id_hotel")
    List<Habitacion> listarPorHotel(@RequestParam(value = "id_hotel",required = false) Integer id_hotel);

    @Query("FROM Habitacion h WHERE h.id_hotel = :id_hotel AND h.ocupada = false")
    List<Habitacion> listarPorHotelOcupada(@RequestParam(value = "id_hotel",required = false) Integer id_hotel);
}
