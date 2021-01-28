package Coche_Proyecto.Componentes;
import java.util.Scanner;

public class Main_Carro extends Coche {
    private String esPublico;
    private int passengersQuantity;

    public Main_Carro() {
        super();
    }

    public Main_Carro(int doorQuantity, int tiresQuantity, String fuelMotor, String brandCar, String seatsLeather, String esPublico) {
        super(doorQuantity, tiresQuantity, fuelMotor, brandCar, seatsLeather);
        this.esPublico = esPublico;
    }

    public void getInfo(){ }

    @Override
    public boolean asientosDeCuero(String seatsLeather) {
        if (seatsLeather.equals("si")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int passengersQuantity(int passengersQuantity) {
        return passengersQuantity;
    }

    public boolean servicioPublico(String esPublico) {
        if (esPublico.equals("si")) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarCarro() {
        Main_Carro renault = new Main_Carro();
        Scanner objeto = new Scanner(System.in);

    }


}

