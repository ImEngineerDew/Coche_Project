package com.toadsdewin.CocheBackend.services;
import com.toadsdewin.CocheBackend.models.BrandModel;
import org.springframework.stereotype.Service;
import com.toadsdewin.CocheBackend.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService
{
    @Autowired
    BrandRepository brandRepository;

    //A method for save the user data;
    public void save(BrandModel car) {
        this.brandRepository.save(car);
    }

    public List<BrandModel> getBrand() {
        return this.brandRepository.findAll();
    }

    public Optional<BrandModel> findById(String id) {
        return this.brandRepository.findById(id);
    }

    public void deleteBrandbyId(String id)
    {
        brandRepository.deleteById(id);
    }
}
