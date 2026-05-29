
import javax.swing.JOptionPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User-15
 */
public class CVector {
    private int V[] = new int  [12];
    private int dim;
    
    public CVector (){
    dim = -1;
    }
    public void CargarVector(){
        String cad = "";
        int valor;
        for (int i = 0; i <= dim; i++)
        cad = JOptionPane.showInputDialog("valor para posicion"+1);
        valor = Integer.parseInt(cad);
        V(1)=valor;
    }
    public void MostrarVector(JTable tvector){
        for (int i = 0; i <= dim; i++)
        {
            tvector.setValueAt(V[i], i, 0);
        }
    }
    public int Cantidad(){
        return (dim + 1);
    }
    public int Suma(){
        int s, valor;
        s = 0;
        for (int i = 0; i <= dim; i++); {
        s = s + V[i];
    }
        return s;
    
    }
}
