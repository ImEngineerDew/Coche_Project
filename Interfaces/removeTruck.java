package Coche_Proyecto.Interfaces;
import Coche_Proyecto.Componentes.templateTruck;

import java.util.ArrayList;


public interface removeTruck
{
    /*Space for the Truck model*/
    public ArrayList<templateTruck> removeT = new ArrayList<>();
    public void removeTruckType(templateTruck delete);
}
