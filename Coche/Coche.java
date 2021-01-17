package Coche_Proyecto.Coche;

public abstract class Coche
{
    private int numero_puerta;
    private int numero_llantas;
    private int cant_asientos;
    private String tipo_motor;
    private String marca;
    private String asientos;

    public abstract Coche()
    {
        numero_puerta = 4;
        numero_llantas = 4;
        cant_asientos = 5;
        tipo_motor = "Gasolina";
        marca = "Renault";
        asientos = "si";
    }

    public Coche(int numero_puerta,int numero_llantas,int cant_asientos,String tipo_motor, String marca, String asientos)
    {
        this.numero_puerta  = numero_puerta;
        this.numero_llantas = numero_llantas;
        this.cant_asientos  = cant_asientos;
        this.tipo_motor     = tipo_motor;
        this.marca          = marca;
        this.asientos       = asientos;
    }
    /*Condicional para verificar si tiene o no asientos de cuero*/

    public abstract boolean tieneAsientos(String asientos);

    public abstract int getNumero_puerta();

    public abstract void setNumero_puerta(int numero_puerta);

    public abstract int getNumero_llantas();

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

}
