package Coche_Proyecto.Interfaces;
import Coche_Proyecto.Componentes.templateTruck;

import java.util.ArrayList;

public interface removeTruck
{
    /*Space for the Truck model*/
    ArrayList<templateTruck> removeT = new ArrayList<>();
    void removeTruckType(templateTruck delete);
}
