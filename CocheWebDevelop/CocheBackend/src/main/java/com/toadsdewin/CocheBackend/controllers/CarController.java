package com.toadsdewin.CocheBackend.controllers;

import com.toadsdewin.CocheBackend.models.CarModel;
import com.toadsdewin.CocheBackend.models.UserModel;
import com.toadsdewin.CocheBackend.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CarController
{
    @Autowired
    CarService carService;

    @PostMapping("/cars")
    public ResponseEntity<Map<String,String>> saveCars(@Valid @RequestBody CarModel car)
    {
        this.carService.save(car);
        Map<String,String> answer  = new HashMap<>();
        answer.put("Message","The car has been introduced properly");
        answer.put("Status","true");

        return ResponseEntity.ok(answer);
    }

    @PutMapping("/cars")
    public ResponseEntity<Map<String,String>> upgradeCars(@Valid @RequestBody CarModel car)
    {
        this.carService.save(car);
        Map<String,String> answer  = new HashMap<>();
        answer.put("Message","The car has been updated properly");
        answer.put("Status","true");

        return ResponseEntity.ok(answer);
    }

    @GetMapping("/cars")
    public List<CarModel> getUsers()
    {
        return this.carService.getCar();
    }

    /**This is the linecode that find the users by id**/
    @GetMapping("/cars/{id}")
    public CarModel getCarById(@PathVariable String id)
    {
        return this.carService.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/cars/{id}")
    public String deleteCar(@PathVariable String id)
    {
        carService.deleteUserbyId(id);
        return "Car deleted by id";
    }

}
