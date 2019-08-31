/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento;

import java.util.*;
/**
 *
 * @author s109e8
 */
public class Seguimiento1 {
    
    /**
     * Procedimiento para Imprimir el mes
     * @param args 
     */
    
     public static void main(String[] args) {
         
         Scanner miScanner= new Scanner(System.in);
         
         //Capturamos el mes
         System.out.print("Ingrese el número del mes: ");
         int numeroMes = miScanner.nextInt();
         compararMes(numeroMes);  
     }
     
    /**
     * Procedimiento para comparar el mes
     * @param numeroMes 
     */
     
     public static void compararMes(int numeroMes){
         
            switch(numeroMes){
                
                case 1:
                    imprimirMes("Enero");
                    break;
                case 2:
                    imprimirMes("Febrero");
                    break;
                case 3:
                    imprimirMes("Marzo");
                    break;
                case 4:
                    imprimirMes("Abril");
                    break;
                case 5:
                    imprimirMes("Mayo");
                    break;
                case 6:
                    imprimirMes("Junio");
                    break;
                case 7:
                    System.out.println("Julio");
                    imprimirMes("Enero");
                    break;
                case 8:
                    imprimirMes("Agosto");
                    break;
                case 9:
                    imprimirMes("Septiembre");
                    break;
                case 10:
                    imprimirMes("Octubre");
                    break;
                case 11:
                    imprimirMes("Noviembre");
                    break;
                case 12:
                    imprimirMes("Diciembre");
                    break;
                    
                default:
                    imprimirMes("El número del mes no es valido");
                    break;
                    
            } 
     }
     
     /**
      * Procedimiento para imprimir mes
      * @param numeroMes 
      */
     public static void imprimirMes(String numeroMes){
         
         System.out.println("El mes ingresado es: "+numeroMes);
         
     }
     
    
    
}
