package com.toadsdewin.CocheBackend.services;
import com.toadsdewin.CocheBackend.models.CarModel;
import com.toadsdewin.CocheBackend.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    //A method for save the user data;
    public void save(CarModel car) {
        this.carRepository.save(car);
    }

    public CarModel findCar(String id)
    {
        return this.carRepository.findById(id).orElse(new CarModel());
    }
    public List<CarModel> getCar() {
        return this.carRepository.findAll();
    }

    public Optional<CarModel> findById(String id) {
        return this.carRepository.findById(id);
    }

    public void deleteUserbyId(String id)
    {
        carRepository.deleteById(id);
    }
}