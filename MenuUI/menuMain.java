package Coche_Proyecto.MenuUI;
import Coche_Proyecto.Componentes.templateTruck;
import Coche_Proyecto.Componentes.templateVehicle;

import java.util.Scanner;

public class menuMain
{
    public static void main (String [] args)
    {
        templateTruck truck = new templateTruck();
        templateVehicle car = new templateVehicle();

        boolean exit = false;

        /*This is a random line*/
        do
        {
            System.out.println("Welcome to the Toads Dewin vehicle store");
            System.out.println("Please choose the vehicle of your preference");
            System.out.println("1. Particular car");
            System.out.println("2. Truck");
            System.out.println("3. Exit of the program");
            System.out.println("\n");
            
            Scanner list = new Scanner(System.in);
            int option = list.nextInt();
                        
            switch(option)
            {
                case 1:
                    //car.getInfo();
                    break;

                case 2:
                    Scanner object = new Scanner(System.in);
                    Scanner objectNum = new Scanner(System.in);

                    int tires,doors,load;
                    String brand, fuel, leather, tiresString,doorsString,loadString,typeString;

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

                    templateTruck truckNew = new templateTruck(doors,tires,fuel,brand,leather,load,typeString);
                    truck.addTruckType(truckNew);

                    truckNew.getInfo();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Thank you for your visit!");
                    break;

                default:
                    System.out.println("Wrong option!");
            }
        }while(!exit);
    }
}