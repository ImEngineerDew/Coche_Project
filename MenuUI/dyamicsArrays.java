package Coche_Proyecto.MenuUI;
import java.util.ArrayList;

public class dyamicsArrays
{
    private String nameData;
    private String surnameData;
    private int ageData;


    public dyamicsArrays() {
        nameData = "John";
        surnameData = "Doe";
        ageData = 25;
    }

    public dyamicsArrays(String nameData, String surnameData, int ageData) {
        this.nameData = nameData;
        this.surnameData = surnameData;
        this.ageData = ageData;
    }

    public String getNameData() {
        return nameData;
    }

    public String getSurnameData() {
        return surnameData;
    }

    public int getAgeData() {
        return ageData;
    }

    public void setNameData(String nameData) {
        this.nameData = nameData;
    }

    public void setSurnameData(String surnameData) {
        this.surnameData = surnameData;
    }

    public void setAgeData(int ageData) {
        this.ageData = ageData;
    }

    public static void main(String[] args) {

        ArrayList<dyamicsArrays> datos = new ArrayList<>();
        dyamicsArrays datosPersona = new dyamicsArrays("John","Doe",28);
        StringBuilder builder = new StringBuilder();

        datos.add(datosPersona);

        for(dyamicsArrays datosRecorrer: datos)
        {
            builder.append(datosRecorrer);
            System.out.println(builder.toString());
        }

    }
}


