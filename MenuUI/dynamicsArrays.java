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


}