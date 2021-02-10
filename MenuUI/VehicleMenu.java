package Coche_Proyecto.MenuUI;
import Coche_Proyecto.Componentes.templateVehicle;
import java.util.Scanner;

public class VehicleMenu
{
    public static void main(String[] args)
    {
        Scanner op = new Scanner (System.in);
        templateVehicle carro = new templateVehicle();
        int opcion = 0;

        do {
            opcion = op.nextInt();

            switch(opcion)
            {
                  case 1:
                  System.out.println("Creando un nuevo coche");
                  carro.getInfo();
                  break;

                  case 2:
            }


        }while(opcion!=0);

    }
}
