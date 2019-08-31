/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import automotores.Carro;
import java.util.Scanner;

/**
 *
 * @author s109e8
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llamado al procedimiento para imprimir nombre
        imprimirNombre();
        
        //funcion para realizar las capturas
        Scanner miScanner= new Scanner(System.in);
        
       
        //Capturando el número 1
        System.out.print("Ingrese el número 1 para realizar las operaciones: ");
        double numeroUno = miScanner.nextDouble();
        System.out.println("El dato ingresado es: "+numeroUno);
        
        //Capturando el número 2
        System.out.println("Ingrese el número 2 para realizar las operaciones: ");
        double numeroDos = miScanner.nextDouble();
        System.out.println("El dato ingresado es: "+numeroDos);
        
        // Llamado a la funcion Suma e imprimir resultados
        double resultadoSuma= sumarNumeros(numeroUno,numeroDos);
        imprimirResultado(resultadoSuma, "Suma");
        
        // Llamado a la función Resta e imprimir resultados
        double resultadoResta= restarNumeros(numeroUno,numeroDos);
        imprimirResultado(resultadoResta,"Resta");
        
        // Llamado a la función Multiplicacion e imprimir resultados
        double resultadoMultiplicacion= multiplicarNumeros(numeroUno,numeroDos);
        imprimirResultado(resultadoMultiplicacion,"Multiplicación");
        
        // Llamado a la función División e imprimir resultados
        double resultadoDivision= dividirNumeros(numeroUno,numeroDos);
        imprimirResultado(resultadoDivision,"División");
        
        //***********************DOS**********************
        
        Carro myPrimerCarro = new Carro("AZUL", 4, 2000, "KIA");
        Carro mySegundoCarro = new Carro("NEGRO", 2, 2016, "CHEVROLET");
        
        double valorPrimerCarro = myPrimerCarro.valorCarro();
        double valorSegundoCarro = mySegundoCarro.valorCarro();
        
        System.out.println("El valor del primer carro es: "+valorPrimerCarro);
        myPrimerCarro.imprimir();
        System.out.println("El valor del segundo carro es: "+valorSegundoCarro);
        mySegundoCarro.imprimir();
        
        
    }
    
    /**
     * Procedimiento para imprimir un nombre
     */
    private static void imprimirNombre(){
        
        //Comando para imprimir en consola.
        
        System.out.println("Mi nombre es: Herny");
        
    }
    
    
    
    
    
    
    /**
     * Funcion para sumar numeros
     * @param numeroUno captura de numero uno
     * @param numeroDos 
     * @return 
     */
    
    private static double sumarNumeros(double numeroUno, double numeroDos){
        
        double resultadoSuma= numeroUno + numeroDos;
        
        return resultadoSuma;
    }
    
    /**
     * Procedimeitno para imprimir la resta de números
     */
    private static double restarNumeros(double numeroUno,double numeroDos){
        
        double resultadoResta= numeroUno - numeroDos;
        
        return resultadoResta;
    }
    
        /**
     * Procedimeitno para imprimir la multiplicacion de números
     */
    private static double multiplicarNumeros(double numeroUno,double numeroDos){
        
        double resultadoMultiplicacion= numeroUno * numeroDos;
        return resultadoMultiplicacion;
       
    }
    
    /**
     * Procedimiento para imprimir la division de números
     */
     private static double dividirNumeros(double numeroUno, double numeroDos){
        
        double resultadoDivision= numeroUno / numeroDos;
        return resultadoDivision;
        
    }
     
  /**
   * 
   * @param resultado
   * @param tipoOperacion 
   */
     private static void imprimirResultado(double resultado, String tipoOperacion){
        System.out.println("La operación realizada es: "+tipoOperacion);
        
        System.out.println("El resultado es: "+ resultado);
    }

}
