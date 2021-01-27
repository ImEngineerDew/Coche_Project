package Coche_Proyecto.Componentes;
import java.util.Scanner;
import java.util.ArrayList;

public class Main_Camioneta extends Coche
{
   private int capacidad;
   private int pasajeros;
   private String tipo_carga;

   ArrayList <Coche> cocheModelo = new ArrayList<>();

   public void addCamioneta (Coche agregado)
   {
       cocheModelo.add(agregado);
   }

   public Main_Camioneta()
   {
      super();
      this.capacidad = 4;               /*Capacidad en volumen*/
      this.tipo_carga = "Ganado";
   }
   public Main_Camioneta(int numero_puerta,int numero_llantas,String tipo_motor, String marca, String asientos, int capacidad, String tipo_carga)
   {
       super(numero_puerta,numero_llantas,tipo_motor,marca,asientos);
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
   @Override
   public int numeroPasajeros(int pasajeros)
   {
       return pasajeros;
   }

   @Override
   public void getInfo()
   {

   }

   public void mostrarCamioneta()
   {
       Scanner objeto = new Scanner(System.in);

       System.out.println("Ingrese el numero de puertas: ");                        int puertas = objeto.nextInt();
       System.out.println("Ingrese el numero de llantas: ");                        int llantas = objeto.nextInt();
       System.out.println("Ingrese el tipo de motor: ");                            String combustible = objeto.nextLine();
       System.out.println("¿La camioneta tiene asientos de cuero: ?");              String asientos = objeto.nextLine();
       Main_Camioneta foton = new  Main_Camioneta(puertas,llantas,combustible,);

       //Espacio para almacenar los datos en los setters
       foton.setMarca(marca_camioneta);
       foton.setTipo_motor(combustible);
       foton.setCapacidad(capacidad_carga);
       foton.setTipo_carga(load);
       foton.numeroPasajeros(numero_acompañantes);

       //Comparativa para imprimir datos
       if(foton.asientosDeCuero(asientos)== true)
       {
          System.out.println("Marca camioneta: "+foton.getMarca());
          System.out.println("Capacidad: "+foton.getCapacidad());
          System.out.println("Combustible: "+foton.getTipo_motor());
          System.out.println("Tipo de carga: "+foton.getTipo_carga());
          System.out.println("Pasajeros: "+foton.numeroPasajeros(numero_acompañantes));
          System.out.println("La camioneta tiene asientos de cuero");
       }
       else
       {
          System.out.println("Marca camioneta: "+foton.getMarca());
          System.out.println("Capacidad: "+foton.getCapacidad());
          System.out.println("Combustible: "+foton.getTipo_motor());
          System.out.println("Tipo de carga: "+foton.getTipo_carga());
          System.out.println("Pasajeros: "+foton.numeroPasajeros(numero_acompañantes));
          System.out.println("La camioneta no tiene asientos de cuero");
         }
       }
}