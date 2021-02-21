package Coche_Proyecto.Interfaces;
import Coche_Proyecto.Componentes.templateVehicle;

import java.util.ArrayList;

public interface carItem
{
    ArrayList<templateVehicle> carType= new ArrayList<>();

    void addVehicleType(templateVehicle addition);
    void removeVehicleType(templateVehicle delete);
}
