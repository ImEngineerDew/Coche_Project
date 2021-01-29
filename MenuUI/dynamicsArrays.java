package Coche_Proyecto.MenuUI;
import java.util.ArrayList;

public class dynamicsArrays
{
        private String nameData;
        private String surnameData;
        private int ageData;

        ArrayList<dynamicsArrays> datos = new ArrayList<>();

        public dynamicsArrays()
        {
                nameData = "John";
                surnameData = "Doe";
                ageData = 28;
        }
        public dynamicsArrays(String nameData,String surnameData, int ageData)
        {
                this.nameData = nameData;
                this.surnameData = surnameData;
                this.ageData = ageData;
        }

        public void addData(dynamicsArrays agregarDato)
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

        /*Main method*/
}