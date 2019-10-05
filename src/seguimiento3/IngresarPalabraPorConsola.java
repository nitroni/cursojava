/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author s109e8
 */
public class IngresarPalabraPorConsola {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra:");
        palabra = scanner.next();
        

        
        imprimir(palabra);
        
    }
    
    public static void imprimir(String palabra){
        
        
        System.out.println("Uppercase: "+palabra.toUpperCase());
        System.out.println("Fowercase: "+palabra.toLowerCase());
        
        String primeraLetra;
        palabra = palabra.toLowerCase();
        primeraLetra = palabra.substring(0,1);
        palabra = palabra.replace(palabra.substring(0,1), primeraLetra.toUpperCase());                
        System.out.println("Camelcase: "+palabra);
        
        
    }
    
}
