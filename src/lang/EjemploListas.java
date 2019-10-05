/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author s109e8
 */
public class EjemploListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //listas();
        //listaFacturas();
        //pila();
        cola();
    }
    
    public static void listas(){
        
        ArrayList<String> miLista = new ArrayList<>();
        
        //Agregar elementos
        miLista.add("Claudia");
        miLista.add("Juan David");     
        miLista.add("Luis"); 
        System.out.println(miLista);
        int size = miLista.size();
        System.out.println("Tamaño="+size);
        try{
            String miEstudiante = miLista.get(2);
            System.out.println(miEstudiante);
            boolean existeEstudiante = miLista.contains("Claudia");
            
            System.out.println("Existe:"+existeEstudiante);
            
            boolean seElimino = miLista.remove("Luis");
            System.out.println("seElimino:"+seElimino);
            System.out.println(miLista);
            
            String seEliminoPosicion = miLista.remove(0);
            
            System.out.println("seElimino:"+seEliminoPosicion);
            
            System.out.println(miLista);
            
        }catch (Exception e){
            System.out.print("Error"+e.getMessage());
        }
        
        
    }
    
    public static void listaFacturas(){
        ArrayList <Factura> misFacturas = new ArrayList<>();
        
        Factura nro1 = new Factura("0000", 19, 55000, 30000);
        misFacturas.add(nro1);
        
        Factura nro2 = new Factura("0001", 20, 54545, 35000);
        misFacturas.add(nro1);
        
        System.out.println(misFacturas);
        
    }
    
    public static void pila(){
        
        Stack<Integer> miPila = new Stack<>();
        miPila.add(1); //libro 1 en la base
        miPila.add(2); //libro 2 en el medio
        miPila.add(3); //libro 3 en la cima
        
        
        System.out.println(miPila.pop()); // Eliminar el libro
        System.out.println(miPila.peek());
        
        System.out.println("Tamaño:"+miPila.size());
        
        
    }
    public static void cola(){
        
        Queue<String> miListaCola = new LinkedList<>();
        miListaCola.add("A"); // Turno 1
        miListaCola.add("B"); // Turno 2
        miListaCola.add("C"); // Turno 3
        
        System.out.println("El tamaño"+miListaCola.size());
        System.out.println("poll: "+miListaCola.poll());
        System.out.println("El tamaño"+miListaCola.size());
        System.out.println("peek: "+miListaCola.peek());
        

    }
    
    
    
}
