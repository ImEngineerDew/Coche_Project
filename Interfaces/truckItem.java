package Coche_Proyecto.Interfaces;
import Coche_Proyecto.Componentes.templateTruck;
import java.util.ArrayList;

public interface truckItem
{
    ArrayList<templateTruck> truckType = new ArrayList<>();
    void addTruckType(templateTruck addition);
    void removeTruckType(templateTruck delete);
}
