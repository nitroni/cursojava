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
@FunctionalInterface
public interface Tester {
    
    
    
    
    public void imprimir();
    
    public default void imprimirDatos(){
        
        System.out.println("Imprimir dos");
    }
    
}
