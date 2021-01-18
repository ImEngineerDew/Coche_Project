package Coche_Proyecto.Componentes;
import java.util.Scanner;

public class Main_Camioneta extends Coche
{
   private int capacidad;
   private String tipo_carga;

   public Main_Camioneta()
   {
      super();
      this.capacidad = 4;
      this.tipo_carga = "Ganado";
   }
   public Main_Camioneta(int numero_puerta,int numero_llantas,int cant_asientos,String tipo_motor, String marca, String asientos, int capacidad, String tipo_carga)
   {
       super(numero_puerta,numero_llantas,cant_asientos,tipo_motor,marca,asientos);
       this.capacidad  = capacidad;
       this.tipo_carga = tipo_carga;
   }

   public int getCapacidad()
   {
       return capacidad;
   }
   public String getTipo_carga()
   {
       return tipo_carga;
   }

   public void setCapacidad(int capacidad)
   {
       this.capacidad = capacidad;
   }
   public void setTipo_carga(String tipo_carga)
   {
       this.tipo_carga = tipo_carga;
   }

   public void mostrarCamioneta()
   {
       Scanner objeto = new Scanner(System.in);
       Main_Camioneta foton = new Main_Camioneta();

       System.out.println("La camioneta tiene asientos de cuero: "); String asientos = objeto.nextLine();
       System.out.println("Ingrese la marca de la camioneta: "); String marca_camioneta = objeto.nextLine();
       System.out.println("Ingrese el tipo de motor: ");         String combustible     = objeto.nextLine();
       System.out.println("Ingrese el tipo de carga: ");         String load            = objeto.nextLine();
       System.out.println("Ingrese la capacidad de carga: ");    int capacidad_carga = objeto.nextInt();

       /*Espacio para almacenar los datos en los setters*/
       foton.setMarca(marca_camioneta);
       foton.setTipo_motor(combustible);
       foton.setCapacidad(capacidad_carga);
       foton.setTipo_carga(load);

       /*Comparativa para imprimir datos*/
       if(foton.asientosDeCuero(asientos)== true)
       {
          System.out.println("Marca camioneta: "+foton.getMarca());
          System.out.println("Capacidad: "+foton.getCapacidad());
          System.out.println("Combustible: "+foton.getTipo_motor());
          System.out.println("Tipo de carga: "+foton.getTipo_carga());
          System.out.println("La camioneta tiene asientos de cuero");
       }
       else
       {
          System.out.println("Marca camioneta: "+foton.getMarca());
          System.out.println("Capacidad: "+foton.getCapacidad());
          System.out.println("Combustible: "+foton.getTipo_motor());
          System.out.println("Tipo de carga: "+foton.getTipo_carga());
          System.out.println("La camioneta no tiene asientos de cuero");
         }
       }

    @Override
    public void getInfo()
    {
        System.out.println("This is just a test from the implementation about of abstract class");
    }
}