package org.example.adt6_practica2.controller;

import org.example.adt6_practica2.model.Habitacion;
import org.example.adt6_practica2.service.IHabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {

    @Autowired
    private IHabitacionService service;

    @PostMapping
    public Habitacion createHabitacion(@RequestBody Habitacion habitacion) {
        return service.registrarHabitacion(habitacion);
    }

    @PutMapping("/{id}/{ocupada}")
    public Habitacion updateHabitacionOcupada(@PathVariable Integer id,@PathVariable boolean ocupada) {
        return service.updateHabitacionOcupada(id, ocupada);
    }

    @DeleteMapping("/{id}")
    public void deleteHabitacion(@PathVariable Integer id) {
        service.deleteHabitacion(id);
    }

    @GetMapping("/listarPorHotelId")
    public ResponseEntity<List<Habitacion>> listarPorHotelId(@RequestParam (value = "id_hotel") Integer id_hotel) {
        List<Habitacion> results = service.listarPorHotel(id_hotel);
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    @GetMapping("/listarPorHotelIdOcupada")
    public ResponseEntity<List<Habitacion>> listarPorHotelIdOcupada(@RequestParam (value = "id_hotel") Integer id_hotel) {
        List<Habitacion> results = service.listarPorHotelOcupada(id_hotel);
        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}
