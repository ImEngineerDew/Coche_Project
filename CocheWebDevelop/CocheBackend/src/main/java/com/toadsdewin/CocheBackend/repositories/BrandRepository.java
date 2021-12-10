package com.toadsdewin.CocheBackend.repositories;
import com.toadsdewin.CocheBackend.models.BrandModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends MongoRepository<BrandModel,String> {
}
