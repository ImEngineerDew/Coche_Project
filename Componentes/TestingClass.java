package Coche_Proyecto.Componentes;
import Coche_Proyecto.Interfaces.truckItem;

import java.util.Scanner;

public class TestingClass
{
    public static void main (String args[])
    {
        int tires, doors, load;
        String brand, fuel, leather, tiresString,doorsString,loadString,typeString;
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

        templateTruck camion = new templateTruck(doors,tires,fuel,brand,leather,load,typeString);
        templateTruck truckKind = new templateTruck();

        truckKind.addTruckType(camion);

        camion.getInfo();
    }


}
