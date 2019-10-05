/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento3;

/**
 *
 * @author s109e8
 */
public class AlturaArbol {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        calcularAlturaArbol();
    }
    
    public static void calcularAlturaArbol(){
        
        double y=0;
        int x = 20;
        int angulo = 35;
        int altura=0;
        
        y = Math.round(x * Math.tan(35));
        
        System.out.println("La altura del arbol es: "+(int)y);
        
    }
    
}
