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
    public int passengersQuantity(int passengersQuantity) {
        return passengersQuantity;
    }

    @Override
    public boolean leatherSeats(String seatsLeather) {
        if (seatsLeather.equals("si")) {
            return true;
        } else
        {
            return false;
        }
    }

    @Override
    public void getInfo()
    {
        int tires, doors;
        String brand, fuel, leather, doorString, fuelString;
        boolean exit = false;

        do {
            System.out.println("You're selected the truck option, please choose the number: ");
            System.out.println("1. Creating a truck ");
            System.out.println("2. Showing a truck ");
            System.out.println("3. Deleting a truck ");

            Scanner option = new Scanner(System.in);
            int opt = option.nextInt();

            switch(opt)
            {
                case 1:
                    break;

                case 2:
                    System.out.println("This is the second option");
                    break;

                case 3:
                    exit= true;
                    break;

            }

        }while(!exit);



    }
}








