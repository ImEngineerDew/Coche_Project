package Coche_Proyecto.Componentes;
import java.util.Scanner;
import java.util.ArrayList;

public class Main_Camioneta extends Coche {
    private int loadCapacity;                //Quantity of the load about of this truck
    private int passengersQuantity;          //Quantity of seats on this truck
    private String typeLoad;

    ArrayList<Coche> cocheModelo = new ArrayList<>();

    public void addCamioneta(Coche agregado) {
        cocheModelo.add(agregado);
    }

    public Main_Camioneta() {
        super();
        this.loadCapacity = 4;               /*Capacidad en volumen*/
        this.typeLoad = "Ganado";
    }

    public Main_Camioneta(int doorQuantity, int tiresQuantity, String fuelMotor, String brandCar, String seatsLeather, int loadCapacity, String typeLoad) {
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
    public boolean asientosDeCuero(String seatsLeather)
    {
        if(seatsLeather.equals("si"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int passengersQuantity(int passengersQuantity) {
        return passengersQuantity;
    }

    @Override
    public void getInfo() {
    }

    public void mostrarCamioneta() {
        Scanner objeto = new Scanner(System.in);
    }
}