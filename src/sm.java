
import javax.swing.JTextField;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad
 */
public class sm {
    public static double add(String h[], JComboBox m) {
   
       int i = 0;
        while (h[i] != null) {
             m.addItem(h[i]);
             i = i +1;
        }
       
        return 0;
        
    }
    
    public static double may(String h, String m, JComboBox D) {
        
        D.addItem(m);
        D.addItem(h);
        
        return 0;
    }
    
    public static double m(String a) {
        
        JOptionPane.showMessageDialog(null,a,"Otrante's IB Code Generator",JOptionPane.WARNING_MESSAGE);
        return 0;
        
    }
}
