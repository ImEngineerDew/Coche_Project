package Coche_Proyecto.Componentes;
import Coche_Proyecto.Interfaces.carItem;
import Coche_Proyecto.Interfaces.tieneAsientos;
import Coche_Proyecto.Interfaces.passengersQuantity;
import java.util.Scanner;

public class templateVehicle extends Coche implements carItem,tieneAsientos,passengersQuantity {

    @Override
    public void addVehicleType(templateVehicle addition)
    {
        carType.add(addition);
    }

    public void removeVehicleType(templateVehicle delete)
    {
        carType.remove(delete);
    }

    public templateVehicle() {
        super();
    }

    public templateVehicle(int doorQuantity, int tiresQuantity, String fuelMotor, String brandCar, String seatsLeather) {
        super(doorQuantity, tiresQuantity, fuelMotor, brandCar, seatsLeather);
    }

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
    public int passengersQuantity(int passengersQuantity) {
        return passengersQuantity;
    }

    @Override
    public void getInfo() {
        String brand, fuel, leather, tiresString, doorsString;
        int tires, doors;

        boolean exit = false;

        do{
            System.out.println("You're selected the car option, please choose the number: ");
            System.out.println("1. Creating a car ");
            System.out.println("2. Showing a car ");
            System.out.println("3. Deleting a car");
            System.out.println("4. Exit the secondary menu");

            Scanner opc = new Scanner(System.in);
            int option = opc.nextInt();

            switch (option) {
                case 1:
                    Scanner object = new Scanner(System.in);
                    Scanner objectInt = new Scanner(System.in);

                    System.out.println("Creating the vehicle..");

                    System.out.println("Please write the brand of the car: ");
                    brand = object.next();
                    System.out.println("Which kind of the fuel has the car?: ");
                    fuel = object.next();
                    System.out.println("Has the truck the leather seats? :");
                    leather = objectInt.nextLine();
                    System.out.println("Please write the quantity of tires: ");
                    tiresString = objectInt.nextLine();
                    System.out.println("Please write the number of doors: ");
                    doorsString = objectInt.nextLine();

                    tires = Integer.parseInt(tiresString);
                    doors = Integer.parseInt(doorsString);

                    templateVehicle car = new templateVehicle(doors, tires, fuel, brand, leather);
                    carType.add(car);
                    break;

                case 2:
                    System.out.println("Car list info: ");
                    System.out.println("\n");
                    for (templateVehicle littleCar : carType) {
                        System.out.println(littleCar.getBrandCar() + "\t" + littleCar.getFuelMotor()
                                + "\t" + littleCar.getTiresQuantity() + "\t" + littleCar.getDoorQuantity());
                    }
                    break;

                case 3:
                    System.out.println("Choose an element from remove by the previous list: ");
                    Scanner removeOpt = new Scanner(System.in);
                    int removeList = removeOpt.nextInt();
                    carType.remove(removeList);
                    break;

                case 4:
                    exit = true;
                    break;
            }
        }while(!exit);
    }
}