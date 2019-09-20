/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

/**
 *
 * @author Henry A. 
 */
public class AgendaTelefonica {
    
    private Contacto[] contactos;
    
    public AgendaTelefonica(){
        this.contactos = new Contacto[15];
    }
    
    /**
     * Agrega un contacto a la agenda
     * @param c 
     */
    public  void agregarContacto(Contacto c){
        
        if(existeContacto(c)){
            System.out.println("El contacto ya existe con ese nombre, ingresa un nombre diferente");
        }
        else if(agendaLlena()){
            System.out.println("AGENDA SIN ESPACIO");
        }
        else{
        
            boolean agregado = false;
            
            for(int i=0; i <contactos.length && !agregado; i++){
                if(contactos[i]==null){
                    contactos[i] = c;
                    agregado= true;
                }
            }

            if(agregado){
                System.out.println("Se ha agregado un contacto de forma exitosa.");
            }
            else{
                System.out.println("No se logro agregar el contacto.");
            }
        }
    }
    
    /**
     * Valida si existe o no el nombre de un contacto en la agenda.
     * @param nombre 
     */
    public void buscarContacto(String nombre){
        
       boolean encontrado = false; 
       for(int i=0; i < contactos.length; i++){
           
           if(contactos[i]!=null && contactos[i].getNombre().equals(contactos[i])){
               
               System.out.println("Su telefono es: "+contactos[i].getTelefono());
               encontrado = true;
           } 
       }
       if(!encontrado){
           System.out.println("No existe el nombre del contacto en la agenda.");
       }
    }
    
    /**
     * Lista todos los contactos de la agenda.
     */
    public void listarContactos(){
        
        for(int i=0; i < contactos.length; i++){
            if(contactos[i]!=null){
                 System.out.println(contactos[i]);
            }    
        
        }
        
    }
    
    /**
     *  Indica si la agenda ya esta llena o no
     * @return 
     */
    public boolean agendaLlena(){
        
        for(int i=0; i < contactos.length; i++){
            if(contactos[i]==null){
                 return false;
            }    
        }
        return true;
    }
    
    /**
     * Me indica cuantos espacios libres hay en la agenda.
     * @return 
     */
    public int espacioLibre(){
        int contadorEpacioLibre=0;
        for(int i=0; i < contactos.length; i++){
            if(contactos[i]==null){
                 contadorEpacioLibre ++;
            }    
        }
        return contadorEpacioLibre;
    }
    
    
    /**
     * Funsión que realiza una busqueda si el contacto que se esta ingresado ya existe.
     * @param c
     * @return 
     */
    public boolean existeContacto(Contacto c){
       
       for(int i=0; i < contactos.length; i++){
           
           if(contactos[i]!=null && c.sonIguales(contactos[i])){
               return true;
           } 
       }

       return false;
    }
    
    
}
