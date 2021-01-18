package Coche_Proyecto.Componentes;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_Carro extends Coche
{
    private String esPublico;
    ArrayList<Main_Carro> coche = new ArrayList <>();
    
    public Main_Carro()
    {
        super();
    }
    public Main_Carro(String asientos, int numero_puerta, int numero_llantas, String tipo_motor,String marca,String esPublico)
    {
        super(numero_puerta,numero_llantas,tipo_motor,marca,asientos);
        this.esPublico = esPublico;
    }
    
    public boolean servicioPublico(String esPublico)
    {
        if (esPublico.equals("si"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void mostrarCarro()
    {
        Main_Carro renault = new Main_Carro();

        Scanner objeto = new Scanner(System.in);

        System.out.println("Ingrese la marca del coche: ");          String marca   = objeto.nextLine();
        System.out.println("Ingrese el tipo de motor: ");            String motor   = objeto.nextLine();
        System.out.println("¿El coche tiene asientos de cuero?: ");  String entrada = objeto.nextLine();
        System.out.println("¿Servicio público?: ");                  String publico = objeto.nextLine();

        renault.setMarca(marca);
        renault.setTipo_motor(motor);

        if(renault.asientosDeCuero(entrada)== true)
        {
            if(renault.servicioPublico(publico) == true)
            {
                System.out.println("Marca: " + renault.getMarca());
                System.out.println("Tipo de motor: " + renault.getTipo_motor());
                System.out.println("El coche tiene asientos de cuero");
                System.out.println("El coche es de servicio público");
            }
            else
            {
                System.out.println("Marca: " + renault.getMarca());
                System.out.println("Tipo de motor: " + renault.getTipo_motor());
                System.out.println("El coche tiene asientos de cuero");
                System.out.println("El coche es partícular");
            }
        }
        else if(renault.asientosDeCuero(entrada)== false)
        {
            if(renault.servicioPublico(publico) == true)
            {
                System.out.println("Marca: " + renault.getMarca());
                System.out.println("Tipo de motor: " + renault.getTipo_motor());
                System.out.println("El coche no tiene asientos de cuero");
                System.out.println("El coche es de servicio público");
            }
            else
            {
                System.out.println("Marca: " + renault.getMarca());
                System.out.println("Tipo de motor: " + renault.getTipo_motor());
                System.out.println("El coche no tiene asientos de cuero");
                System.out.println("El coche es partícular");
            }
        }
    }

    @Override
    public void getInfo()
    {

    }
}
