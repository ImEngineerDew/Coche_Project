package com.toadsdewin.CocheProyecto.personal.Principal;
import java.util.Scanner;
import com.toadsdewin.CocheProyecto.personal.Persona;

public class Principal
{
    public static void main (String args[])
    {
        Persona persona1 = new Persona();
        Scanner objeto = new Scanner (System.in);

        System.out.println("Ingrese los nombres: ");
        String nombre = objeto.nextLine();

        System.out.println("Ingrese los apellidos: ");
        String apellido = objeto.nextLine();
        
        System.out.println("Ingrese la edad a evaluar: ");
        int edad = objeto.nextInt();

        if(edad>=18)
        {
            persona1.setAge(edad);
            System.out.println("Edad: "+persona1.getAge()+"\ny es mayor de edad");
        }
        else
        {
            persona1.setAge(edad);
            System.out.println("Edad: "+persona1.getAge()+"\ny es menor de edad");
        }


        //Putting the setters
        persona1.setName(nombre);
        persona1.setSurname(apellido);
        persona1.setAge(edad);

        //Printing the dates
        System.out.println("Nombres: "+persona1.getName());
        System.out.println("Apellido: "+persona1.getSurname());
    }
}

