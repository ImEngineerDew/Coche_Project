package Coche_Proyecto.MenuUI;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayTesting
{
    public static void main(String args[])
    {
        ArrayList <String> cadenas = new ArrayList<>();
        Scanner objeto  = new Scanner(System.in);

        boolean isRunnable = true;
        System.out.println("Running...");

        while(isRunnable)
        {
            System.out.println("Please write your name: ");
            String name = objeto.nextLine();

            if(name.equalsIgnoreCase("exit"))
            {
                break;
            }
            cadenas.add(name);
        }

        for(String recorrido: cadenas)
        {
            System.out.println(cadenas.toString());
        }


    }
}
