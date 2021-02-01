package Coche_Proyecto.Componentes;
import java.util.Scanner;
import java.util.ArrayList;


public class templateTruck extends Coche {
    private int loadCapacity;                //Quantity of the load about of this truck
    private int passengersQuantity;          //Quantity of seats on this truck
    private String typeLoad;

    private ArrayList<templateTruck> cocheModelo = new ArrayList<>();

    public void addCamioneta(templateTruck agregado) {
        cocheModelo.add(agregado);
    }

    public templateTruck() {
        super();
        this.loadCapacity = 4;               /*Capacidad en volumen*/
        this.typeLoad = "Ganado";
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
    public void getInfo()
    {

    }
}








