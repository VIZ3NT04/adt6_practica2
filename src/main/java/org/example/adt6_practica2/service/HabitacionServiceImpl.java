package org.example.adt6_practica2.service;

import org.example.adt6_practica2.model.Habitacion;
import org.example.adt6_practica2.repository.IHabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HabitacionServiceImpl implements IHabitacionService {

    @Autowired
    private IHabitacionRepository repo;

    @Override
    public Habitacion registrarHabitacion(Habitacion habitacion) {
        return repo.save(habitacion);
    }

    @Override
    public void deleteHabitacion(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Habitacion updateHabitacionOcupada(Integer id, boolean ocupado) {
        Habitacion habitacion = repo.findById(id).get();
        habitacion.setOcupada(ocupado);
        return repo.save(habitacion);
    }

    @Override
    public List<Habitacion> listarPorHotel(Integer id_hotel) {
        List<Habitacion> allData = repo.findAll();

        List<Habitacion> results = new ArrayList<>();

        for (Habitacion data : allData) {
            if (id_hotel != null && data.getId_hotel().equals(id_hotel)) {
                results.add(data);
            }
        }
        return results;
    }

    @Override
    public List<Habitacion> listarPorHotelOcupada(Integer id_hotel) {
        List<Habitacion> allData = repo.listarPorHotelOcupada(id_hotel);

        List<Habitacion> results = new ArrayList<>();

        for (Habitacion data : allData) {
            if (id_hotel != null && data.getId_hotel().equals(id_hotel)) {
                results.add(data);
            }
        }
        return results;
    }

}
