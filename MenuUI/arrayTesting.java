package Coche_Proyecto.MenuUI;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayTesting
{
    private String nameData;
    private String surnameData;
    private int ageData;

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


    public static void main(String args[])
    {
        ArrayList <String> cadenas = new ArrayList<>();
        Scanner objeto  = new Scanner(System.in);

        boolean isRunnable = true;
        System.out.println("Running...");

        while(isRunnable)
        {
            System.out.println("Please write your name: ");
            String name = objeto.nextLine();

            if(name.equalsIgnoreCase("exit"))
            {
                break;
            }
            cadenas.add(name);
        }

        for(String recorrido: cadenas)
        {
            System.out.println(cadenas.toString());
        }


    }
}
