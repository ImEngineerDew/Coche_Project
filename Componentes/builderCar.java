package Coche_Proyecto.Componentes;
import java.util.Scanner;
import static Coche_Proyecto.Interfaces.carItem.carType;

public class builderCar
{
    public void getInfo()
    {
        templateCar car = new templateCar();

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

                    templateCar carNew = new templateCar(doors, tires, fuel, brand, leather);
                    car.addVehicleType(carNew);
                    break;

                case 2:
                    System.out.println("Car list info: ");
                    System.out.println("\n");
                    for (templateCar littleCar : carType) {
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
