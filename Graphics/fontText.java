package Coche_Proyecto.Graphics;
import java.awt.*;
import javax.swing.*;

public class fontText
{
    public static void main(String[] args)
    {
        boolean isTheFontAvailable = false;
        String fonts = JOptionPane.showInputDialog("Please introduce your font type: ");
        String [] myStrings = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for(String fontName: myStrings)
        {
            if(fontName.equals(fonts))
            {
                isTheFontAvailable =  true;
            }
        }
        if(isTheFontAvailable)
        {
            System.out.println("Font installed");
        }
        else{
            System.out.println("The font is not available");
        }
    }
}
