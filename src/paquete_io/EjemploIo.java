/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author s109e8
 */
public class EjemploIo {
    
    public static void main(String[] args){
        try {
            
            crearArchivoBytes();
            crearArchivoBytess();
            
        } catch (Exception e) {
        }
        
        
    }
    
    
    private static void crearArchivoBytes() throws IOException{
        
        FileInputStream miStrieam = null;
        
        try {

             miStrieam = new FileInputStream("pruebaInputStream.txt");

            int miByte = miStrieam.read();

            while(miByte != -1){
                System.out.println(miByte);
                miByte = miStrieam.read();
            }
            
        } catch (Exception e) {
            
        }
        finally{
            if(miStrieam !=null){
                miStrieam.close();
            }
        }
        
        
    }
    
    private static void crearArchivoBytess() throws IOException{
        
        FileOutputStream miStream =null;
        
        try {
            
            miStream = new FileOutputStream("pruebaOuputStream.txt");
            miStream.write(new byte[]{100,101,103});
            
            
            
        } finally {
            
             if(miStream !=null){
                miStream.close();
            }
        }
        
    }
    
    private static void leerArchivoCharacter() throws IOException{
        
        FileReader miStream =null;
        
        try {
            
            miStream = new FileReader("pruebaOuputStream.txt");
            //miStream.write("Escribir Linea 1");
            
            
            
        } finally {
            
             if(miStream !=null){
                miStream.close();
            }
        }
        
    }
    
    
}
