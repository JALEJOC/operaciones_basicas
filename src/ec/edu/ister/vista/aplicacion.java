/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.controlador.coordinador;
import ec.edu.ister.modelo.operaciones;

/**
 *
 * @author LAB1-PC
 */
public class aplicacion {
    public static void main(String[] args) {
        
        coordinador objeto=new coordinador();
                
        objeto.menuScanner();
        //operaciones objeto=new operaciones();
        /*operaciones.suma();
        operaciones.resat();
        objeto.multiplicacion();
        objeto.division();*/
        
    }
}
