package com.toadsdewin.CocheBackend.controllers;

import com.toadsdewin.CocheBackend.models.BrandModel;
import com.toadsdewin.CocheBackend.models.CarModel;
import com.toadsdewin.CocheBackend.services.BrandService;
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
public class BrandController
{
    @Autowired
    BrandService brandService;

    @PostMapping("/brands")
    public ResponseEntity<Map<String,String>> saveBrands(@Valid @RequestBody BrandModel brand)
    {
        this.brandService.save(brand);
        Map<String,String> answer  = new HashMap<>();
        answer.put("Message","The car has been introduced properly");
        answer.put("Status","true");

        return ResponseEntity.ok(answer);
    }

    @PutMapping("/brands")
    public ResponseEntity<Map<String,String>> upgradeBrands(@Valid @RequestBody BrandModel brand)
    {
        this.brandService.save(brand);
        Map<String,String> answer  = new HashMap<>();
        answer.put("Message","The car has been updated properly");
        answer.put("Status","true");

        return ResponseEntity.ok(answer);
    }

    @GetMapping("/brands")
    public List<BrandModel> getUsers()
    {
        return this.brandService.getBrand();
    }

    /**This is the linecode that find the users by id**/
    @GetMapping("/brands/{id}")
    public BrandModel getCarById(@PathVariable String id)
    {
        return this.brandService.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/cars/{id}")
    public String deleteCar(@PathVariable String id)
    {
        brandService.deleteBrandbyId(id);
        return "Brand deleted by id";
    }
}
