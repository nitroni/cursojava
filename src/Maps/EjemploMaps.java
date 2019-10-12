/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author s109e8
 */
public class EjemploMaps {
    
    public static void main(String[] args){
        //crearHasmap();
        //crearTreemap();
        crearLinkedMHasmap();
    }
    
    public static void crearHasmap(){
        
        Map<Integer, String> miLista= new HashMap<>();
        
        miLista.put(5,"LORENA");
        miLista.put(6,"JOSE");
        miLista.put(7,"CESAR");
        miLista.put(8,"LUIS");
        
        for(Map.Entry<Integer, String> elemento : miLista.entrySet()){
            
                     Integer key= elemento.getKey();
                     String value= elemento.getValue();
                     System.out.println("Llave="+key+" value="+value);
            
        }
        
;
        
    }
    
    public static void crearTreemap(){
        
        Map<Integer, String> miLista= new HashMap<>();
        miLista.put(55,"LORENA");
        miLista.put(6,"JOSE");
        miLista.put(77,"CESAR");
        miLista.put(8,"LUIS");
        
       
        miLista.forEach((llave,valor) -> {
            System.out.println("Llave="+llave+" Valor="+valor );
            
        });
    }
    
     public static void crearLinkedMHasmap(){
         
         
        Map<Integer, String> miLista= new LinkedHashMap<>();
        miLista.put(55,"LORENA");
        miLista.put(6,"JOSE");
        miLista.put(77,"CESAR");
        miLista.put(8,"LUIS");
        
       
        miLista.forEach((llave,valor) -> {
            System.out.println("Llave="+llave+" Valor="+valor );
            
        });
         
     }
    
    
}
