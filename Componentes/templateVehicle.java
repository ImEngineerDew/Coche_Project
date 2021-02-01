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

    public templateVehicle(int doorQuantity, int tiresQuantity, String fuelMotor, String brandCar, String seatsLeather, String esPublico) {
        super(doorQuantity, tiresQuantity, fuelMotor, brandCar, seatsLeather);
        this.esPublico = esPublico;
    }



    @Override
    public boolean leatherSeats(String seatsLeather) {
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

    @Override
    public void getInfo() {

        Scanner object = new Scanner(System.in);

        System.out.println("Please write the brand of the car: ");          String brand = object.next();
        System.out.println("Which kind of the fuel has the car?: ");        String fuel = object.next();
        System.out.println("Has the truck the leather seats? :");           String leather = object.next();
        System.out.println("Is the public service the car?: ");             String publicService = object.next();
        System.out.println("Please write the quantity of tires: ");         int tires = object.nextInt();
        System.out.println("Please write the number of doors: ");           int doors = object.nextInt();

        templateVehicle car = new templateVehicle(doors,tires,fuel,brand,leather,publicService);

        if (car.servicioPublico(publicService))
        {
            if(car.asientosDeCuero(leather))
            {
                carModel.add(car);
                for(templateVehicle listado: carModel)
                {
                    System.out.println("The car belongs to the public service and has leather seats");
                }
            }
            else
            {
                carModel.add(car);
                for(templateVehicle listado: carModel)
                {
                    System.out.println("The car belongs to the public service and hasn't leather seats");
                }
            }
        }
        else
        {
            if(car.asientosDeCuero(leather))
            {
                carModel.add(car);
                for(templateVehicle listado: carModel)
                {
                    System.out.println("The car doesn't belong to the public service and has leather seats");
                }
            }
            else
            {
                carModel.add(car);
                for(templateVehicle listado: carModel)
                {
                    System.out.println("The car doesn't belong to the public service and hasn't leather seats");
                }
            }
        }
    }
}