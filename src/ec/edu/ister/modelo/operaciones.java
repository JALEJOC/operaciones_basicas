/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;


/**
 *
 * @author LAB1-PC
 */
public class operaciones {
    private int n2,n1;


    public operaciones() {
    }

    public operaciones(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

 public static void suma(){
     JOptionPane.showMessageDialog(null,"la suma es: "+(5+6));
  }     
  public static int resat(){
      int res=8-6;
      return res; 
  }
  public void multiplicacion(){
      JOptionPane.showMessageDialog(null,"la multiplicacion es: "+(5*6));
        }
  public int division(){
int div=10/2;
return div;
}
}
    
 