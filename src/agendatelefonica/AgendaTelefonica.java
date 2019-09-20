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
    
    public  void agregarContacto(Contacto c){
        
        boolean encontrado = false;
        for(int i=0; i <contactos.length; i++){
            
            if(contactos[i]==null){
                contactos[i] = c;
                encontrado= true;
            }
        }
        
        if(encontrado){
            System.out.println("Se ha agregado un contacto de forma exitosa.");
        }
        else{
            System.out.println("AGENDA SIN ESPACIO");
        }
    }
    
    
    public boolean buscarContacto(String nombre){
        
       for(int i=0; i < contactos.length; i++){
           
           if(contactos[i]!=null && nombre.equals(contactos[i])){
               return true;
           } 
       }
       return false;
    }
    
    
    public void listarContactos(){
        
        for(int i=0; i < contactos.length; i++){
            if(contactos[i]!=null){
                 System.out.println(contactos[i]);
            }    
        
        }
        
    }
    
    public void agendaLlena(){
        
        
    }
    
    public void espacioLibre(){
        
        
    }
    
    
}
