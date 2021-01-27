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


}