package Coche_Proyecto.MenuUI;
import Coche_Proyecto.Componentes.Main_Camioneta;
import Coche_Proyecto.Componentes.Main_Carro;

import java.util.Scanner;

public class menuMain
{
    public static void main (String args[])
    {
        System.out.println("Bienvenido a la concesionaria Toads Dewin");
        System.out.println("Por favor seleccione el vehículo de su preferencia");
        System.out.println("1. Carro partícular");
        System.out.println("2. Camioneta");

        Main_Camioneta camioneta = new Main_Camioneta();
        Main_Carro carro = new Main_Carro();

        int opcion = 0;

        do
        {
            Scanner lista = new Scanner(System.in);
            opcion = lista.nextInt();

            switch(opcion)
            {
                case 1:
                    opcion = 0;
                    carro.mostrarCarro();
                break;

                case 2:
                    opcion=0;
                    camioneta.getInfo();
                break;

                default:
                    System.out.println("Opción no válida");
            }
        }while(opcion!=0);
    }
}
