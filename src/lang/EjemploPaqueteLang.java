/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

import java.util.Locale;

/**
 *
 * @author s109e8
 */
public class EjemploPaqueteLang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String nombre="Henry";
        
        String nombre2 = "henry";
        
        System.out.println("Equal:"+nombre.equals(nombre2));
        System.out.println("Equal:"+nombre.equalsIgnoreCase(nombre2));
        
        String apellido = "Carvajal";
        
        System.out.println("Con string "+nombre+" "+apellido);
       
        StringBuffer nombreCompleto = new StringBuffer("Henryl");
        nombreCompleto.append(" Carvajal");
        nombreCompleto.insert(0, "Hola:");
        nombreCompleto.deleteCharAt(4);
        
        String mensajeBienvenida = nombreCompleto.substring(0,4);
        String mensajeBienvenida2 = "id:nombre:fecha:";
        System.out.println("Con String Buffer Nombre completo "+nombreCompleto);
        
        System.out.println("Substring "+mensajeBienvenida);
        
        System.out.println("Invertir "+nombreCompleto.reverse());
        
        String[] split =  mensajeBienvenida.split("l");
        System.out.println("Split: "+split[0]+" "+split[1]);
        
        String[] split2 =  mensajeBienvenida2.split(":");
        System.out.println("Split2: "+split2[0]+" "+split2[1]);
        
        char miChar;
        Character mi_Char = 'p';
        Character mi_Char2 = 'a';
        
        
       boolean isDigit =  mi_Char.isDigit(mi_Char);
       System.out.println("El char es un digito="+isDigit);
       
       int compare = mi_Char.compareTo(mi_Char2);
       System.out.println("La comparación: "+compare);
       
       
       
       System.out.println("Upper="+Character.toUpperCase(mi_Char));
       
       System.out.println("Lower="+Character.toLowerCase(mi_Char));
       
        
        // Crear numero aleatorio
        
        double nro1= Math.random();
        
        //System.out.println(nro1);
        
        double nro2 = Math.random()*100;
        //System.out.println(nro2);
        
        System.out.println("numero redondeado="+Math.round(nro2));
        System.out.println("Nro redondeado mayor="+Math.floor(nro2));
        System.out.println("Nro redondeado menor="+Math.ceil(nro2));
        
    }
    
}
