package Coche_Proyecto.MenuUI;
import Coche_Proyecto.Componentes.templateTruck;
import Coche_Proyecto.Componentes.templateVehicle;

import java.util.Scanner;

public class menuMain
{
    public static void main (String [] args)
    {
        templateTruck camioneta = new templateTruck();
        templateVehicle carro = new templateVehicle();

        boolean exit = false;

        do
        {
            System.out.println("Welcome to the Toads Dewin vehicle store");
            System.out.println("Please choose the vehilcle of your preference");
            System.out.println("1. Particular car");
            System.out.println("2. Truck");
            System.out.println("3. Exit of the program");
            System.out.println("\n");
            
            Scanner lista = new Scanner(System.in);
            int opcion = lista.nextInt();
                        
            switch(opcion)
            {
                case 1:
                    carro.getInfo();
                    break;

                case 2:
                    camioneta.getInfo();
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