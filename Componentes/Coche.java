package Coche_Proyecto.Componentes;

public abstract class Coche implements tieneAsientos, passengersQuantity
{
    private int doorQuantity;
    private int tiresQuantity;
    private String fuelMotor;
    private String brandCar;
    private String seatsLeather;

    public Coche()
    {
        doorQuantity = 4;
        tiresQuantity = 4;
        fuelMotor= "Gasolina";
        brandCar = "Renault";
        seatsLeather = "si";
    }

    public Coche(int doorQuantity,int tiresQuantity,String fuelMotor, String brandCar, String seatsLeather)
    {
        this.doorQuantity  = doorQuantity;
        this.tiresQuantity = tiresQuantity;
        this.fuelMotor     = fuelMotor;
        this.brandCar      = brandCar;
        this.seatsLeather  = seatsLeather;
    }
    /*Condicional para verificar si tiene o no asientos de cuero*/

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
    public int numeroPasajeros(int passengersQuantity)
    {
        return passengersQuantity;
    }

    public int getDoorQuantity() {
        return doorQuantity;
    }

    public void setDoorQuantity(int doorQuantity) {
        this.doorQuantity = doorQuantity;
    }

    public int getTiresQuantity() {
        return tiresQuantity;
    }

    public void setTiresQuantity(int tiresQuantity) {
        this.tiresQuantity = tiresQuantity;
    }

    public String getFuelMotor() {
        return fuelMotor;
    }

    public void setFuelMotor(String fuelMotor) {
        this.fuelMotor = fuelMotor;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar)
    {
        this.brandCar = brandCar;
    }

    public abstract void getInfo();

    public abstract void showInfo();
}
