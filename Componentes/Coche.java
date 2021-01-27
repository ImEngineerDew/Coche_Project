package Coche_Proyecto.Componentes;

public abstract class Coche implements tieneAsientos, numeroPasajeros
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

    public boolean asientosDeCuero(String asientos)
    {
        if(asientos.equals("si"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int numeroPasajeros(int pasajeros)
    {
        return pasajeros;
    }

    public int getNumero_puerta() {
        return numero_puerta;
    }

    public void setNumero_puerta(int numero_puerta) {
        this.numero_puerta = numero_puerta;
    }

    public int getNumero_llantas() {
        return numero_llantas;
    }

    public void setNumero_llantas(int numero_llantas) {
        this.numero_llantas = numero_llantas;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract void getInfo();
}
