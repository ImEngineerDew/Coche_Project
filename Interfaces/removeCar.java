package Coche_Proyecto.Interfaces;
import Coche_Proyecto.Componentes.templateVehicle;

import java.util.ArrayList;

public interface removeCar
{
    ArrayList <templateVehicle> removeC = new ArrayList<>();
    void removeCarType(templateVehicle delete);
}
