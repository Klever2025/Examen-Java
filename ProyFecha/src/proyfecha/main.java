/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyfecha;

import javax.swing.JOptionPane;

/**
 *
 * @author User-15
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CFecha f1;
                f1=new CFecha();
        String Cad=JOptionPane.showInputDialog("Introd dia");
        int x=Integer.parseInt(Cad);
        f1.SetDia(x);
                
                
      String Cad1=JOptionPane.showInputDialog("Introd mes");
      int y=Integer.parseInt(Cad1);
      f1.SetMes(y);
      
      String Cad2=JOptionPane.showInputDialog("Introd Anio");
     int z=Integer.parseInt(Cad2);
     f1.SetAnio(z);
    int e=f1.CalcularEdad();
    JOptionPane.showInputDialog(null, "Tu edad es " + e);
    
    }
    
}
