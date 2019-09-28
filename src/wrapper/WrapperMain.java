/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

import java.util.ArrayList;

/**
 *
 * @author s109e8
 */
public class WrapperMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Wrappers");
        
        //Double de tipo primitivo
        double saldo = 500.000;
        
        //Objeto de tipo double
        Double wrapperSaldo = new Double("8000");
        boolean isNan = wrapperSaldo.isNaN();
        
        int inSaldo = wrapperSaldo.intValue();
        
        ArrayList<Integer> lista;
                
        System.out.println("la nan "+isNan );
        
        System.out.println("int value"+inSaldo);
        
        int edad =80;
        Integer wrapperEdad = new Integer(edad);
        Integer wrapperEdad2 = edad;
        System.out.println(wrapperEdad);
        System.out.println(wrapperEdad2);
    }
    
}
