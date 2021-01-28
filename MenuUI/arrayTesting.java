package Coche_Proyecto.MenuUI;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayTesting
{
    private String nameData;
    private String surnameData;
    private int ageData;
    ArrayList <arrayTesting> personalData = new ArrayList<>();

    public void addGuy(arrayTesting agregado)
    {
        personalData.add(agregado);
    }

    public arrayTesting ()
    {
        nameData= "John";
        surnameData = "Doe";
        ageData = 25;
    }

    public arrayTesting(String nameData,String surnameData,int ageData)
    {
        this.nameData = nameData;
        this.surnameData = surnameData;
        this.ageData = ageData;
    }

    public String getNameData()
    {
        return nameData;
    }
    public String getSurnameData()
    {
        return surnameData;
    }
    public int getAgeData()
    {
        return ageData;
    }

    public void setNameData(String nameData)
    {
        this.nameData = nameData;
    }
    public void setSurnameData(String surnameData)
    {
        this.surnameData = surnameData;
    }
    public void setAgeData(int ageData)
    {
        this.ageData = ageData;
    }


    public static void main(String args[])
    {
        //White space for checking and analyze the code
    }
}
