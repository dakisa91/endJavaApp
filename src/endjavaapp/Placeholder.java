/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package endjavaapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import javax.swing.FocusManager;
import javax.swing.JTextField;

/**
 *
 * @author jordashiro
 */
public class Placeholder extends JTextField
{
    String strToPrint;

    @Override
    protected void paintComponent(java.awt.Graphics g)
    {
        super.paintComponent(g);

        if(getText().isEmpty() && ! (FocusManager.getCurrentKeyboardFocusManager().getFocusOwner() == this)){
            Graphics2D g2 = (Graphics2D)g.create();
            g2.setBackground(Color.gray);
            g2.setFont(getFont().deriveFont(Font.ITALIC));
            g2.drawString(strToPrint, 5, 20); //figure out x, y from font's FontMetrics and size of component.
            g2.dispose();
        }
    }
    
    public Placeholder(String myStr)
    {
        strToPrint = myStr;
    }
}