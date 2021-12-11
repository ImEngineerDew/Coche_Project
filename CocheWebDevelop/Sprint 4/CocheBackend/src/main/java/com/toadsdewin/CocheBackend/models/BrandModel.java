package com.toadsdewin.CocheBackend.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "brand")
public class BrandModel
{
    @Id
    private String id;
    private String name;
    private String modelCar;
    private int ageModel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getAgeModel() {
        return ageModel;
    }

    public void setAgeModel(int ageModel) {
        this.ageModel = ageModel;
    }
}
