/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author s109e8
 */
public class EjercicioExcel {
    
    
    public static void main(String[] args){
        try {
            productosPorTipo();
           
        } catch (Exception e) {
        }
        
        
    }
    
    private static void leerArchivo() throws IOException{
        
        BufferedReader miStream =null;
        
        try {
            miStream = new BufferedReader(new FileReader("productos.csv"));
            String miBuffer= miStream.readLine();
            int contador=0;
            double acomulador=0;
            
            while (miBuffer !=null) {
               
                String [] columna = miBuffer.split(",");

                if(!columna[3].equals("Precio")){
                    double precio = Double.parseDouble(columna[3]);
                    acomulador = acomulador + precio;
                    contador++;
                 }
                
                miBuffer = miStream.readLine();
            }
            
            System.out.println("Promedio de productos: "+acomulador/contador);
            
            
        } catch (Exception e) {
            
        }
        finally {
          if(miStream!=null){
             miStream.close();
          }
        }
    }
        
        
        
        private static void productosPorTipo() throws IOException{
            
            BufferedReader miStream =null;

            try {
                miStream = new BufferedReader(new FileReader("productos.csv"));
                String miBuffer= miStream.readLine();
                
                int contador1=0;
                int contador2=0;
                int contador3=0;
                int contador4=0;
                int contador5=0;

                while (miBuffer !=null) {

                    String [] columna = miBuffer.split(",");
                    
                    System.out.println(columna[2].trim());
                    System.out.println();
                    

                    if(!columna[2].trim().equals("Tipo") && !columna[2].trim().equals("ALCANTARILLADO Y ASEO")){
                        
                         System.out.println("PASO");
                        
                        /*int tipo = Integer.parseInt(columna[2]);
                        
                        if(tipo==1){
                            contador1++;
                        }
                        else if(tipo==2){
                            contador2++;
                        }
                        else if(tipo==3){
                            contador3++;
                            
                        }else if(tipo==4){
                            contador4++;
                            
                        }else{
                            contador5++;
                        }*/
                    } else {
                    }

                    miBuffer = miStream.readLine();
                }

                System.out.println("Tipo 1: "+contador1);
                System.out.println("Tipo 2: "+contador2);
                System.out.println("Tipo 3: "+contador3);
                System.out.println("Tipo 4: "+contador4);
                System.out.println("Tipo 5: "+contador5);

            } catch (Exception e) {
                   System.out.println(e);
            }
            finally {
              if(miStream!=null){
                 miStream.close();
              }
            }
            
        }
        
        
        
        
}
