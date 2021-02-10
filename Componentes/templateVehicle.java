package Coche_Proyecto.Componentes;


import java.util.Scanner;
import java.util.ArrayList;

public class templateVehicle extends Coche {

    private String esPublico;
    private ArrayList <templateVehicle> carModel = new ArrayList <>();

    private void addCar(templateVehicle agregado)
    {
        carModel.add(agregado);
    }

    public templateVehicle() {
        super();
    }

    public templateVehicle(int doorQuantity, int tiresQuantity, String fuelMotor, String brandCar, String seatsLeather) {
        super(doorQuantity, tiresQuantity, fuelMotor, brandCar, seatsLeather);
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
    public int passengersQuantity(int passengersQuantity) {
        return passengersQuantity;
    }

    @Override
    public void getInfo()
    {
        String brand, fuel, leather, tiresString, doorsString;
        int tires, doors;

        System.out.println("You're selected the car option, please choose the number: ");
        System.out.println("1. Creating a car ");
        System.out.println("2. Showing a car ");
        System.out.println("3. Deleting a car");

        Scanner opc = new Scanner (System.in);

        int option = opc.nextInt();

        do {
            option = 0;

            switch(option)
            {
                case 1:
                    Scanner object = new Scanner(System.in);
                    Scanner objectInt = new Scanner (System.in);

                    System.out.println("Creating the vehicle..");

                    System.out.println("Please write the brand of the car: ");          brand = object.next();
                    System.out.println("Which kind of the fuel has the car?: ");        fuel = object.next();
                    System.out.println("Has the truck the leather seats? :");           leather = objectInt.nextLine();
                    System.out.println("Please write the quantity of tires: ");         tiresString = objectInt.nextLine();
                    System.out.println("Please write the number of doors: ");           doorsString = objectInt.nextLine();

                    tires = Integer.parseInt(tiresString);
                    doors = Integer.parseInt(doorsString);

                    templateVehicle car = new templateVehicle(doors,tires,fuel,brand,leather);
                    carModel.add(car);
            }
        }while(option!=0);
    }
}