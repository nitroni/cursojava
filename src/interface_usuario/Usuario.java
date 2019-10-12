/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_usuario;

import com.sun.org.apache.xml.internal.serializer.ToStream;

/**
 *
 * @author s109e8
 */
public class Usuario {
    
    private String nombre;
    private String edad;
    private String email;
    
    public Usuario(String nombre, String edad, String email){
        
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }
    
   // private arrayList<Usuario>
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
