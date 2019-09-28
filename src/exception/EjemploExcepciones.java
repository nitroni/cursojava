/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s109e8
 */
public class EjemploExcepciones {
    
    public static void main(String[] args){
        
        try {
            //convertirNumeros();
            lanzarExcepcion();
            lanzarExcepcionConThrows();
            System.out.println("Mensaje des pues de convertir numeros");
        } catch (Exception ex) {
            Logger.getLogger(EjemploExcepciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void convertirNumeros(){
        try {
            
            int number = 5;
            
            if(number < 0){
               throw new MyNumberException(CodigoErrores.POSITIVOS);
            }
            
            if(number % 2 ==0){
                //Lanzar excepcion de 300
                throw new MyNumberException(CodigoErrores.PARES);
                
            }else{
                 throw new MyNumberException(CodigoErrores.IMPARES);
            }
            
            //Bloque de codigo
            Integer wrapperInteger = new Integer("hola mundo");
            System.out.println();
            
        } catch (Exception e) {
            
            //Ingresa al cath
            System.out.println("Ingresa al catch"+e.toString());
            
        }finally{
            
            System.out.println("Ejecucion en el finally");
            }
        
        
    }
    
    public static void ejecucionDeDatos() throws Exception{
        lanzarExcepcionConThrows();
    }
    
    public static void lanzarExcepcion(){
        
        try {
            System.out.println("Inicio para lanzar una excepcion ");
            throw new Exception("Esta es la excepcion lanzada.");
            
        } catch (Exception ex) {
            System.out.println("Capturar la excepcion");
            System.out.println(ex);
        }
    }
    public static void lanzarExcepcionConThrows() throws Exception{
        
        throw new Exception("Esta es la excepcion");
        
    }
}
