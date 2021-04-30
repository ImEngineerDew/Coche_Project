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
    public void getInfo()
    {
        int tires, doors, load;
        String brand, fuel, leather, tiresString,doorsString,loadString,typeString;
        boolean exit = false;

        do {
            System.out.println("You're selected the truck option, please choose the number: ");
            System.out.println("1. Creating a truck ");
            System.out.println("2. Showing a truck ");
            System.out.println("3. Deleting a truck ");
            System.out.println("4. Exit the secondary menu");

            Scanner option = new Scanner(System.in);
            int opt = option.nextInt();

            switch(opt)
            {
                case 1:
                    Scanner object = new Scanner(System.in);
                    Scanner objectNum = new Scanner(System.in);

                    System.out.println("Creating the truck...");

                    System.out.println("Please write the brand of the car: ");
                    brand = object.nextLine();
                    System.out.println("Which kind of the fuel has the car?: ");
                    fuel = object.nextLine();
                    System.out.println("Has the truck the leather seats? :");
                    leather = object.nextLine();
                    System.out.println("Please write the quantity of tires: ");
                    tiresString = object.nextLine();
                    System.out.println("Please write the number of doors: ");
                    doorsString = object.nextLine();
                    System.out.println("Please write the quantity of load: ");
                    loadString = object.nextLine();
                    System.out.println("Please write the kind of load: ");
                    typeString = object.nextLine();

                    tires = Integer.parseInt(tiresString);
                    doors = Integer.parseInt(doorsString);
                    load  = Integer.parseInt(loadString);
                    break;

                case 2:
                    System.out.println("Truck list info: ");
                    System.out.println("\n");
                    for(templateTruck list: truckType)
                    {
                        System.out.println(list.getBrandCar()+"\t"+list.getLoadCapacity()
                                +"\t"+list.getTypeLoad()+"\t"+list.getFuelMotor()+"\t"
                                +"\t"+list.getDoorQuantity()+"\t"+list.getTiresQuantity());
                    }
                    break;

                case 3:
                    System.out.println("Choose an element from remove by the previous list: ");
                    Scanner removeOpt = new Scanner(System.in);
                    int removeList = removeOpt.nextInt();
                    truckType.remove(removeList);
                    break;

                case 4:
                    exit= true;
                    break;
            }
        }while(!exit);
    }

}