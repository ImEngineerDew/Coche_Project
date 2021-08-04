package Coche_Proyecto.Interfaces;
import Coche_Proyecto.Componentes.templateCar;

import java.util.ArrayList;

public interface carItem
{
    ArrayList<templateCar> carType= new ArrayList<>();

    void addVehicleType(templateCar addition);
    void removeVehicleType(templateCar delete);
}
