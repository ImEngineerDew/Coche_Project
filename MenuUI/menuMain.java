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
                    truck.getInfo();
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