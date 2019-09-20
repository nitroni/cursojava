/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

import java.util.*;

/**
 *
 * @author Henry A.
 */
public class ProgramaCuentas {
    
    public static void main(String[] args){
        
        String titularCuenta;
        String opcionSaldo;
        double saldoActual = 10000;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del titular de la cuenta: ");
        titularCuenta = scanner.next();
        
        System.out.println("Necesita ingresar un nuevo salto?: A) SI, B) NO");
        opcionSaldo = scanner.next();
        
        if(opcionSaldo.equals("A")){
            System.out.println("Ingrese el sadlo actual: ");
            saldoActual = scanner.nextDouble();
            Cuenta miCuenta = new Cuenta(titularCuenta, saldoActual);
            operacionMenu(miCuenta, scanner);
            
        }else{
            Cuenta miCuenta = new Cuenta(titularCuenta);
            operacionMenu(miCuenta, scanner);
        }
 
    }
    
    /** 
     * Procedimiento Operacion Menu
     * @param miCuenta
     * @param scanner 
     */
    public static void operacionMenu(Cuenta miCuenta, Scanner scanner){
        
        double cantidadIngresar;
        String opcionMenu;
        
        System.out.println("Seleccione una de las opciones: A)Ingresar, B)Retirar, S)Salir ");
        opcionMenu = scanner.nextLine();
    
        while(!opcionMenu.equals("S")){
            
            if(opcionMenu.equals("A")){
                System.out.println("Ingrese la cantidadad a ingresar: ");
                cantidadIngresar = scanner.nextDouble();
                miCuenta.ingresar(cantidadIngresar);
            }
            else if(opcionMenu.equals("B")){
                System.out.println("Ingrese la cantidad a retirar: ");
                cantidadIngresar = scanner.nextDouble();
                miCuenta.retirar(cantidadIngresar);
            }
            else if(opcionMenu.equals("S")){
                opcionMenu = "S";
            }
            else{
                System.out.println("La opción no es valida.");
            }
            
            
            System.out.println("Seleccione una de las opciones: A)Ingresar, B)Retirar, S)Salir ");
            opcionMenu = scanner.next();
        }
    
        
    }

}
