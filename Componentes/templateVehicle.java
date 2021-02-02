package Coche_Proyecto.Componentes;


import java.util.Scanner;
import java.util.ArrayList;

public class templateVehicle extends Coche {

    private String esPublico;
    private ArrayList <templateVehicle> carModel = new ArrayList <>();

    private void addCar(templateVehicle agregado)
    {
        carModel.add(agregado);
    }

    public templateVehicle() {
        super();
    }

    public templateVehicle(int doorQuantity, int tiresQuantity, String fuelMotor, String brandCar, String seatsLeather) {
        super(doorQuantity, tiresQuantity, fuelMotor, brandCar, seatsLeather);
    }



    @Override
    public boolean leatherSeats(String seatsLeather) {
        if (seatsLeather.equals("si")) {
            return true;
        } else
        {
            return false;
        }
    }

    @Override
    public int passengersQuantity(int passengersQuantity) {
        return passengersQuantity;
    }

    @Override
    public void getInfo() {

        Scanner object = new Scanner(System.in);
        Scanner objectInt = new Scanner (System.in);

        System.out.println("Please write the brand of the car: ");          String brand = object.next();
        System.out.println("Which kind of the fuel has the car?: ");        String fuel = object.next();
        System.out.println("Has the truck the leather seats? :");           String leather = objectInt.nextLine();
        System.out.println("Please write the quantity of tires: ");         String tiresString = objectInt.nextLine();
        System.out.println("Please write the number of doors: ");           String doorsString = objectInt.nextLine();

        int tires = Integer.parseInt(tiresString);
        int doors = Integer.parseInt(doorsString);

        templateVehicle car = new templateVehicle(doors,tires,fuel,brand,leather);

        if(car.asientosDeCuero(leather) )
        {
           carModel.add(car);
           for(templateVehicle listado: carModel)
           {
             //System.out.println("Brand\t¿Leather seats?\tFuel class");
             System.out.println(car.getBrandCar()+"\t"+car.leatherSeats("si")+"\t"+"\t"+car.getFuelMotor());
             System.out.println("The car belongs to the public service and has leather seats");
           }
        }
        else
        {
            carModel.add(car);
            for(templateVehicle listado: carModel)
            {
              //System.out.println("Brand\t¿Leather seats?\tFuel class");
              System.out.println(car.getBrandCar()+"\t"+car.leatherSeats("no")+"\t"+"\t"+car.getFuelMotor());
              System.out.println("The car belongs to the public service and hasn't leather seats");
            }
        }
    }
}