/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento2;

import java.util.*;

/**
 *
 * @author s109e8
 */
public class Seguimiento2 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        
        numeros1Al100();
        numeros100Al1();
        numerospares1Al150();
        sumaNumeros1Al200();
        imprimirAsteriscos();
        imprimirTabla10Por10();
        
    }
    
    public static void numeros1Al100(){
        
         System.out.println("----1.Numeros incrementales del 100 al 1----");
        
        //Impresion de datos ciclo For del 1 al 100
        System.out.println("---Ciclo For---");
        for(int i=1; i <=100; i++){
            System.out.println(i);
        }
        
        //Impresion de datos ciclo while del 1 al 100
        
        System.out.println("---Ciclo while---");
        int i=1;
        while(i <=100){
            
            System.out.println(i);
            i++;
        }
    }
    
    public static void numeros100Al1(){
        
        System.out.println("----2.Numeros incrementales del 100 al 1----");
        
        //Impresion de datos ciclo For del 100 al 1
        System.out.println("---Ciclo For---");
        for(int i = 100; i >= 1; i--){
            System.out.println(i);
        }
        
        //Impresion de datos ciclo while del 100 al 1
        System.out.println("---Ciclo while---");
        int i = 100;
        while(i >= 1 ){
            
             System.out.println(i);
             i--;
        }
       
    }
    
    public static void numerospares1Al150(){
        
        System.out.println("---3.Numeros pares del 1 al 150---");
        
        //Impresion de datos ciclo For del 1 al 150
        System.out.println("---Ciclo For---");
        for(int i = 1; i <= 150; i++){
            
            if((i%2)==0){
                
                System.out.println(i);
            }
        }
        
        //Impresion de datos ciclo while del 1 al 150
        System.out.println("---Ciclo while---");
        int i = 1;
        while(i <= 150){
            
            if((i%2)==0){
                
                System.out.println(i);
            }
            
            i++;
        }
        
    }
    
    public static void sumaNumeros1Al200(){
        
        System.out.println("---4.Suma de los número del 1 al 200----");
        
        double suma=0;
        
        //Impresion de datos ciclo For de la suma del 1 al 200
        System.out.println("---Ciclo for---");
        for(int i=1; i<=200; i++){
            suma=suma+i;
        }
        System.out.println(suma);
        
        
        //Impresion de datos ciclo while de la suma del 1 al 200
        System.out.println("---Ciclo while---");
        suma= 0;
        int i = 0;
        while(i <= 200){
            suma=suma+i;
            i++;
        }
        System.out.println(suma);

    }
    
    
    public static void imprimirAsteriscos(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---5. Mostrar asteriscos----");
        
        System.out.print("Ingrese el número: ");
        int numero = scanner.nextInt();
        
        //Impresion de datos ciclo For del número de asteriscos
        System.out.println("---Ciclo For---");
        for(int i=1; i <= numero; i++){
            System.out.print("* ");
        }
        
        
        //Impresion de datos ciclo While del número de asteriscos
        System.out.println("---Ciclo while---");
        int i=1;
        while(i <= numero){
            System.out.print("* ");
            i++;
        }
        
    }
    
    public static void imprimirTabla10Por10(){
        
        
           System.out.println("-------6. Cilo For Mostrar matriz de 10 * 10, en donde X representa los Pares y O los impares-----");
        
           String [][] matriz = new String[10][10];
           
           int contador = 0;
           
            
           //Impresion de datos ciclo for matriz 10 * 10
           System.out.println("---Ciclo For---");
           for(int i=0; i< 10; i++){
               
               for(int j = 0; j< 9; j++){
               
                   if((contador%2)==0){
                       
                       matriz[i][j]="X ";
                       
                   }else{
                       
                       matriz[i][j]="O ";
                   }
                   
                   System.out.print(matriz[i][j]);
                   
                   contador++;
                   
               }
               
               System.out.println();
               
            }
           
            System.out.println("---Ciclo while---");
            //Impresion de datos ciclo While matriz 10 * 10
            int i =0;
            int j =0;
            String [][] matrizJ = new String[10][10];
            contador = 0;
            while(i < 10){
                j=0;
                while(j < 9){
                    if((contador%2)==0){
                       matrizJ[i][j]="X ";
                    }else{
                       matrizJ[i][j]="O ";
                    }
                    System.out.print(matrizJ[i][j]);
                    contador++;
                    j++;
               }
               System.out.println();
               i++;
            }
           
          
    
    }
    
    
    
    
}
