package Coche_Proyecto.Coche.Principal;
import Coche_Proyecto.Coche.Coche;
import java.util.Scanner;

public class Main_Carro extends Coche
{
    public Main_Carro()
    {
        super();
    }
    public Main_Carro(String asientos, int numero_puerta, int cant_asientos, int numero_llantas, String tipo_motor)
    {

    }
    public static void main(String[] args)
    {
        Main_Carro renault = new Main_Carro();

        Scanner objeto = new Scanner(System.in);

        System.out.println("Ingrese la marca del coche: ");          String marca   = objeto.nextLine();
        System.out.println("Ingrese el tipo de motor: ");            String motor   = objeto.nextLine();
        System.out.println("¿El coche tiene asientos de cuero?: ");  String entrada = objeto.nextLine();

        renault.setMarca(marca);
        renault.setTipo_motor(motor);

        if(renault.tieneAsientos(entrada)== true)
        {
            System.out.println("Marca: "+renault.getMarca());
            System.out.println("Tipo de motor: "+renault.getTipo_motor());
            System.out.println("El coche tiene asientos de cuero");
        }
        else if(renault.tieneAsientos(entrada)== false)
        {
            System.out.println("Marca: "+renault.getMarca());
            System.out.println("Tipo de motor: "+renault.getTipo_motor());
            System.out.println("El coche no tiene asientos de cuero");
        }
    }
}
