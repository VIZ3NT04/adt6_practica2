package org.example.adt6_practica2.controller;

import org.example.adt6_practica2.model.Hotel;
import org.example.adt6_practica2.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private IHotelService service;

    @PostMapping
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return service.registrarHotel(hotel);
    }

    @GetMapping
    public List<Hotel> getAllHotels() {
        return service.buscarHoteles();
    }

    @GetMapping("/lisitarPorLocaCate")
    public ResponseEntity<List<Hotel>> listarPorLocaCate(@RequestParam (value = "categoria",required = false) String categoria,
                                                        @RequestParam (value = "localidad",required = false) String localidad){
        List<Hotel> resultado = service.listarLocaCate(categoria,localidad);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }
}
