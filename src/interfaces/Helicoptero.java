/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author s109e8
 */
public class Helicoptero implements Voladores{

    @Override
    public void despegar() {
        
        System.out.print("Despegando helicoptero......");
        
      
    }

    @Override
    public void aterrizar() {
        
        System.out.print("Aterrizando helicoptero......");
        
    }

    @Override
    public boolean servirComida() {
        
        System.out.print("En el helicoptero no sirven comida......");
        return false;

    }

    @Override
    public void volar() {
        
        System.out.println("Vlolando helicoptero.......");
        
    }
    
    
    
}
