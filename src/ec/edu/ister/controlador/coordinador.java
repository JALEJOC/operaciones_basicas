/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import ec.edu.ister.modelo.operaciones;
import java.util.Scanner;

/**
 *
 * @author LAB1-PC
 */
public class coordinador {
    Scanner entrada=new Scanner(System.in);
    operaciones objoperaciones=new operaciones();
    public void opcionesMen(){
        System.out.println("ingresa una opcion:\n"
                    +"1.-Sumar(metodo de clase)\n"
                    +"2.-Restar(metodo de clase)\n"
                    +"3.-Division(metodo de instancia)\n"
                    +"4.-multiplicacion(metodo instancia)\n"
                    +"5.-Salir\n");
    }
    public void menuScanner(){
        int op=0;
        do {            
            opcionesMen();
            op=entrada.nextInt();
            switch(op){
                case 1:
                    operaciones.suma();
                    break;
                case 2:
                    System.out.println("la resta es:"+operaciones.resat());
                    break;
                case 3:
                    System.out.println("la division  es:"+objoperaciones.division());
                    break;
                case 4: 
                    objoperaciones.multiplicacion();
                    break;    
            }
        } while (op!=5);
        
        
    }
}
