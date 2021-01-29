package Coche_Proyecto.MenuUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Sampling
{
        private String nameData;
        private String surnameData;
        private int ageData;

        private ArrayList<Sampling> datos = new ArrayList<>();

        public Sampling()
        {
                nameData = "John";
                surnameData = "Doe";
                ageData = 28;
        }
        public Sampling(String nameData,String surnameData, int ageData)
        {
                this.nameData = nameData;
                this.surnameData = surnameData;
                this.ageData = ageData;
        }

        public void addData(Sampling agregarDato)
        {
                datos.add(agregarDato);
        }

        /*Getters*/
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

        /*Setters*/
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


        public void sampleResult()
        {
                Scanner objeto = new Scanner (System.in);
                System.out.println("Write your name: ");          String name = objeto.nextLine();
                System.out.println("Write your surname: ");       String surn = objeto.nextLine();
                System.out.println("Write your age: ");           int    aged = objeto.nextInt();

                Sampling datosPersona = new Sampling(name,surn, aged);


                datos.add(datosPersona);

                for(Sampling resultado : datos)
                {
                        System.out.println("Name: "+resultado.getNameData()+" Surname: "+resultado.getSurnameData()+ " Age: "+resultado.getAgeData());
                        System.out.println();
                }
        }

        /*Main method*/
        public static void main(String args[])
        {
                Sampling result = new Sampling();
                result.sampleResult();
        }
}