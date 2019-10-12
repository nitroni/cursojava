/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;
import javax.swing.text.html.parser.Element;

/**
 *
 * @author s109e8
 */
public class EjemploStreams {
    
    
    public static void main(String[] args){
        
        crearLista();
        
        
    }
    
    public static void crearLista(){
        
       
        ArrayList<String> miLista = new ArrayList<String>(); 
        
        miLista.add("Lorena");
        miLista.add("Henryy");
        miLista.add("claudia");
        miLista.add("cesar");
        
        //miLista.stream().filter((elemento)-> {return elemento.toString().length() >=6;});
        miLista.stream()
        .filter((elemento)-> {
            return elemento.length() >=6;
        })     
        .map((elemento)-> {       
           return elemento.toUpperCase();
        })
        .forEach((elemento) -> {
            System.out.println(elemento);
        });
        
        //Forma tradicional
        for(int i =0; i<miLista.size(); i++){

            //Imprimir en un upecase los nombres que tenga mas de 6 caracteres
            String nombre = miLista.get(i);
            if (nombre.length() >= 6){
                System.out.println(nombre.toUpperCase());
            }
            
            //System.out.println(nombre);
            
        }
        
        
        
        //List result = miLista.stream().sorted().collect(Collectors.toList());
        
        
    }
    
    
}
