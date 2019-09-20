/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import java.util.*;

/**
 *
 * @author Henry A.
 */
public class ProgramaAgendaTelefonica {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        AgendaTelefonica miAgenda = new AgendaTelefonica();

        operacionMenu(scanner,miAgenda);
    }
    
    /**
     * Procedimiento que genera el Menu y ejecuta las acciones
     * @param scanner
     * @param miAgenda 
     */
     public static void operacionMenu(Scanner scanner,AgendaTelefonica miAgenda){
         
        String opcionMenu;
        int telefono; 
        String nombre;
        String correo;
        int espacioLibre=0;
        Contacto c;
        
        System.out.println("Ingrese una opción:");
        System.out.println("\n A) Agregar un contacto. \n B) Buscar contacto \n C) Listar agenda \n D) Ver si la agenda esta llena \n E) Ver espacios libres de la agenda \n S) Salir del programa \n :");
        opcionMenu = scanner.next();
        
       
        while(!opcionMenu.equals("S")){
            
            if(opcionMenu.equals("A")){
                System.out.println("Ingrese el nombre del contacto: ");
                nombre = scanner.next();
                System.out.println("Ingrese el telefono: ");
                telefono = scanner.nextInt();
                System.out.println("Ingrese el correo del contacto: ");
                correo = scanner.next();
                c= new Contacto(nombre, telefono, correo);
                miAgenda.agregarContacto(c);
            }
            else if(opcionMenu.equals("B")){
                System.out.println("Ingrese el nombre del contacto a buscar: ");
                nombre = scanner.next();
                miAgenda.buscarContacto(nombre);
            }
            else if(opcionMenu.equals("C")){
                miAgenda.listarContactos();
            }
            else if(opcionMenu.equals("D")){
                miAgenda.listarContactos();
            }
            else if(opcionMenu.equals("E")){
                espacioLibre = miAgenda.espacioLibre();
                System.out.println("Espacios libres en la agenda: "+espacioLibre);
            }
            else if(opcionMenu.equals("S")){
                opcionMenu = "S";
            }
            else{
                System.out.println("La opción no es valida.");
            }

            System.out.println("\nIngrese una opción:");
            System.out.println("\n A) Agregar un contacto. \n B) Buscar contacto \n C) Listar agenda \n D) Ver si la agenda esta llena \n E) Ver espacios libres de la agenda \n S) Salir del programa \n :");
            opcionMenu = scanner.next();
        }
    
        
    }
    
}
