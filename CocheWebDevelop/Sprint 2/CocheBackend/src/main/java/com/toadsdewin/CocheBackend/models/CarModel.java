package com.toadsdewin.CocheBackend.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cars")
public class CarModel
{
    @Id
    private String id;
    private int doorQuantity;
    private int tiresQuantity;
    private String fuelMotor;
    private String seatsLeather;
    private BrandModel brandCar;
    private UserModel userModel;        //User information


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDoorQuantity() {
        return doorQuantity;
    }

    public void setDoorQuantity(int doorQuantity) {
        this.doorQuantity = doorQuantity;
    }

    public int getTiresQuantity() {
        return tiresQuantity;
    }

    public void setTiresQuantity(int tiresQuantity) {
        this.tiresQuantity = tiresQuantity;
    }

    public String getFuelMotor() {
        return fuelMotor;
    }

    public void setFuelMotor(String fuelMotor) {
        this.fuelMotor = fuelMotor;
    }

    public String getSeatsLeather() {
        return seatsLeather;
    }

    public void setSeatsLeather(String seatsLeather) {
        this.seatsLeather = seatsLeather;
    }

    public BrandModel getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(BrandModel brandCar) {
        this.brandCar = brandCar;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
}
