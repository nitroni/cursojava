/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recolector;

/**
 *
 * @author s109e8
 */
public class EjemploRecolector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro1 = new Carro("", 0, 0, "");
        System.out.println(carro1);
         
        Carro carro2 = new Carro("", 0, 0, "");
        System.out.println(carro2);
        
        carro1 = null;
        System.out.println(carro1);
        
        
    }
    
}
