package Coche_Proyecto.MenuUI;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayTesting
{
    private String nameData;
    private String surnameData;
    private int ageData;
    ArrayList <arrayTesting> personalData = new ArrayList<>();

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

    public void addGuy(arrayTesting agregado)
    {
        personalData.add(agregado);
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
        Scanner objeto  = new Scanner(System.in);
        ArrayList <arrayTesting> personalData = new ArrayList<>();
        String name;
        String surname;
        int age;

        boolean isRunnable = true;
        System.out.println("Running...");

        while(isRunnable)
        {
            System.out.println("Please write your name: ");
            name = objeto.nextLine();
            System.out.println("Please write your surname: ");
            surname = objeto.nextLine();
            System.out.println("Please write your age: ");
            age = objeto.nextInt();

            arrayTesting modelo = new arrayTesting(name,surname,age);

            if(name.equalsIgnoreCase("exit"))
            {
                break;
            }
            else if (surname.equalsIgnoreCase("exit"))
            {
                break;
            }
            else if(age==0)
            {
                break;
            }
            personalData.add(modelo);
        }

        for(arrayTesting recorrido: personalData)
        {
            System.out.println(personalData.toString());
        }
    }
}
