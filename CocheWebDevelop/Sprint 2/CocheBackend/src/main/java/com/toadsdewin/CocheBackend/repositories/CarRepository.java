package com.toadsdewin.CocheBackend.repositories;
import com.toadsdewin.CocheBackend.models.CarModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends MongoRepository<CarModel,String> {

}
