package Coche_Proyecto.Graphics;
import javax.swing.*;
import java.awt.*;

public class CreateMark
{
    public static void main (String args[])
    {
        myMark nuevoMarco = new myMark();
        nuevoMarco.setVisible(true);
        nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class myMark extends JFrame
{
    public myMark()
    {
       Toolkit myScreen = Toolkit.getDefaultToolkit();
       Dimension tamanioPantalla = myScreen.getScreenSize();

       int alturaPantalla = tamanioPantalla.height;
       int anchoPantalla = tamanioPantalla.width;
       setSize(anchoPantalla/2,alturaPantalla/2);
       setLocation(anchoPantalla/4,alturaPantalla/4);
       setTitle("My application");
    }
}
