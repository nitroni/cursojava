/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_funcionales;

/**
 *
 * @author s109e8
 */
public class EjemploInterfaces {
    
    
    public static void main(String[] args){
        
        Tester test = () ->{
            
            System.out.println("Implemetacion metodo imprimir");
            
        };
        
        test.imprimir();
        test.imprimirDatos();
        
        Tester test2 = () ->{
            
            System.out.println("Hola implementacion test 2");
            
        };
        
        test.imprimir();
        
    }
   
    
    
}
