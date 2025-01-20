package org.example.adt6_practica2.repository;

import org.example.adt6_practica2.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHotelRepository extends JpaRepository<Hotel, Integer> {
    @Modifying
    @Query("FROM Hotel h WHERE h.categoria LIKE :categoria AND h.localidad LIKE :localidad")
    List<Hotel> listarLocaCate(@Param("categoria") String categoria,
                               @Param("localidad") String localidad);

}
