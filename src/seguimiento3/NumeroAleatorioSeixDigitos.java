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
public class NumeroAleatorioSeixDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        caluclarNumeroAleatorioSeixDigitos();
    }
    
    public static void caluclarNumeroAleatorioSeixDigitos(){
        
        double numeroalertorio = Math.round(Math.random()*600000);
        int numeroImprimir = (int)numeroalertorio;

      
        System.out.println("Numero aleatorio de 6 digitos es: "+numeroImprimir);
    }
}
