package Coche_Proyecto.Componentes;
import Coche_Proyecto.Interfaces.carItem;
import Coche_Proyecto.Interfaces.tieneAsientos;
import Coche_Proyecto.Interfaces.passengersQuantity;
import java.util.Scanner;

public class templateVehicle extends Coche implements carItem,tieneAsientos,passengersQuantity {

    @Override
    public void addVehicleType(templateVehicle addition) {
        carType.add(addition);
    }

    public void removeVehicleType(templateVehicle delete) {
        carType.remove(delete);
    }

    public templateVehicle() {
        super();
    }

    public templateVehicle(int doorQuantity, int tiresQuantity, String fuelMotor, String brandCar, String seatsLeather) {
        super(doorQuantity, tiresQuantity, fuelMotor, brandCar, seatsLeather);
    }

    public boolean leatherSeats(String seatsLeather) {
        if (seatsLeather.equals("yes")) {
            return true;
        } else {
            return false;

        }
    }

    @Override
    public int passengersQuantity(int passengersQ) {
        return passengersQ;
    }

    public void getInfo(){}
}