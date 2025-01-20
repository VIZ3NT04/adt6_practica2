package org.example.adt6_practica2.service;

import org.example.adt6_practica2.model.Hotel;
import org.example.adt6_practica2.repository.IHotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements IHotelService {

    @Autowired
    private IHotelRepository repo;

    @Override
    public Hotel registrarHotel(Hotel hotel) {
        return repo.save(hotel);
    }

    @Override
    public List<Hotel> buscarHoteles() {
        return repo.findAll();
    }

    @Override
    public List<Hotel> listarLocaCate(String categoria, String localidad) {
        List<Hotel> allData = repo.findAll();

        List<Hotel> results = new ArrayList<>();

        for (Hotel data : allData) {
            if (categoria != null && data.getCategoria().equals(categoria)) {
                results.add(data);
            } else if (localidad != null && data.getLocalidad().equals(localidad)) {
                results.add(data);
            }

        }
        return results;
    }
}
