package Coche_Proyecto.Graphics;
import javax.swing.*;

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
        setSize(800,600);
    }
}
