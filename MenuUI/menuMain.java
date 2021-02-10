package Coche_Proyecto.MenuUI;
import Coche_Proyecto.Componentes.templateTruck;
import Coche_Proyecto.Componentes.templateVehicle;

import java.util.Scanner;

public class menuMain
{
    public static void main (String args[])
    {
        templateTruck camioneta = new templateTruck();
        templateVehicle carro = new templateVehicle();

        boolean exit = false;

        do
        {
            System.out.println("Bienvenido a la concesionaria Toads Dewin");
            System.out.println("Por favor seleccione el vehículo de su preferencia");
            System.out.println("1. Carro partícular");
            System.out.println("2. Camioneta");
            
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

                default:
                    System.out.println("Opción no válida");
            }
        }while(!exit);
    }
}
