/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enum_constantes;

/**
 *
 * @author s109e8
 */
public enum Maderas {
    
    ROBLE("Rojo", 500),
    PINO("Verde", 400);

    public final String color;
    public final double peso;

    Maderas(String color, double peso){
        
        this.peso = peso;
        this.color = color;


    }

}
   
   

