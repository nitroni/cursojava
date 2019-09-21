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
public class EjemploConstantesEnum {
    
    public static void main(String[] args){
        Cuenta miCuenta = new Cuenta();
        
        System.out.println("Concecutivo "+miCuenta.CONSECUTIVO_INICIAL);
        
        System.out.println("Tipo de madera "+TipoMadera.PINO);
        
        System.out.println("Tipo de madera "+TipoMadera.ROBLE);
        
        System.out.println("Maderas "+Maderas.PINO.peso);
        
    }
    
}
