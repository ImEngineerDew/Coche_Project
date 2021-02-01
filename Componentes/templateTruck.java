package Coche_Proyecto.Componentes;
import java.util.Scanner;
import java.util.ArrayList;


public class templateTruck extends Coche {
    private int loadCapacity;                //Quantity of the load about of this truck
    private int passengersQuantity;          //Quantity of seats on this truck
    private String typeLoad;

    private ArrayList<templateTruck> cocheModelo = new ArrayList<>();

    public void addCamioneta(templateTruck agregado) {
        cocheModelo.add(agregado);
    }

    public templateTruck() {
        super();
        this.loadCapacity = 4;               /*Capacidad en volumen*/
        this.typeLoad = "Ganado";
    }

    public templateTruck(int doorQuantity, int tiresQuantity, String fuelMotor, String brandCar, String seatsLeather, int loadCapacity, String typeLoad) {
        super(doorQuantity, tiresQuantity, fuelMotor, brandCar, seatsLeather);
        this.loadCapacity = loadCapacity;
        this.typeLoad = typeLoad;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public String getTypeLoad() {
        return typeLoad;
    }

    @Override
    public boolean asientosDeCuero(String seatsLeather)
    {
        if(seatsLeather.equals("si"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int passengersQuantity(int passengersQuantity) {
        return passengersQuantity;
    }

    @Override
    public void getInfo()
    {
        Scanner objeto = new Scanner(System.in);

        System.out.println("Please write the type of the fuel: ");          String fuel = objeto.nextLine();
        System.out.println("Write your brand car: ");                       String brand= objeto.nextLine();
        System.out.println("Has the truck the leather seats? :");           String leather = objeto.nextLine();
        System.out.println("What kind of load do you support your car?: "); String loadKind = objeto.nextLine();
        System.out.println("Please write the number of the doors: ");       int doors = objeto.nextInt();
        System.out.println("Please write the number of the tires  ");       int tires = objeto.nextInt();
        System.out.println("What's the capacity of this truck?: ");         int caps = objeto.nextInt();

        templateTruck camioneta = new templateTruck(doors,tires,fuel,brand,leather,caps,loadKind);
        StringBuilder listado = new StringBuilder();

        if(camioneta.asientosDeCuero(leather)== true)
        {
            cocheModelo.add(camioneta);

            for(templateTruck camionetas: cocheModelo)
            {
                listado.append(camionetas.getBrandCar()+"\t"+camionetas.getTiresQuantity()+"\t"
                               +camionetas.getDoorQuantity()+"\t"+camionetas.getTiresQuantity());
                System.out.println(listado.toString());
                System.out.println("The truck has leather seats!");
            }
        }
        else
        {
            cocheModelo.add(camioneta);

            for(templateTruck camionetas: cocheModelo)
            {
                listado.append("Brand: "+camionetas.getBrandCar()+" Fuel type: "+camionetas.getFuelMotor());
                System.out.println(listado.toString());
                System.out.println("Trhe truck hasn't leather seats!");
            }
        }
    }
}