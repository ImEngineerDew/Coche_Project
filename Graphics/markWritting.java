package Coche_Proyecto.Graphics;
import javax.swing.*;
import java.awt.*;

public class markWritting
{
    public static void main(String args[]) {
        newMark marco = new newMark();
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

    class newMark extends JFrame
    {
        public newMark ()
        {
            setVisible(true);
            setSize(800,600);
            setLocation(400,300);
            setTitle("Programa");
            sheet sheetKind = new sheet();
            add(sheetKind);
        }
    }

    class sheet extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawString("Dewin Acosta",100,100);       //Coordenadas y texto en la ventana
        }
    }


