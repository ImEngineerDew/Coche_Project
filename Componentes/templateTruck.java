package Coche_Proyecto.Componentes;
import Coche_Proyecto.Interfaces.truckItem;
import Coche_Proyecto.Interfaces.passengersQuantity;
import Coche_Proyecto.Interfaces.tieneAsientos;
import java.util.Scanner;

public class templateTruck extends Coche implements truckItem, passengersQuantity,tieneAsientos
{
    private int loadCapacity;                //Quantity of the load about of this truck
    private String typeLoad;

    @Override
    public void addTruckType(templateTruck addition)
    {
        truckType.add(addition);
    }
    @Override
    public void removeTruckType(templateTruck delete)
    {
        truckType.remove(delete);
    }

    public templateTruck() {
        super();
        this.loadCapacity = 4;               /*Volume capacity*/
        this.typeLoad = "Cattle";
    }

    public templateTruck(int doorQuantity, int tiresQuantity, String fuelMotor, String brandCar, String seatsLeather, int loadCapacity, String typeLoad) {
        super(doorQuantity, tiresQuantity, fuelMotor, brandCar, seatsLeather);
        this.loadCapacity = loadCapacity;
        this.typeLoad = typeLoad;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public String getTypeLoad() {
        return typeLoad;
    }

    @Override
    public int passengersQuantity(int passengersQ) {
        return passengersQ;
    }

    @Override
    public boolean leatherSeats(String seatsLeather)
    {
        if (seatsLeather.equals("yes"))
        {
            return true;
        }
            else
        {
            return false;
        }
    }

    @Override
    public void getInfo(){}
}