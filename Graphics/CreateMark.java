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
        //setSize(800,600);   //Giving a window size
        //setLocation(0,0);
        setBounds(50,100, 480,320);
        setTitle("My Java app");
        //setResizable(true);
        //setExtendedState(Frame.MAXIMIZED_BOTH);
    }
}
