/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

import java.util.*;

/**
 *
 * @author hmunoze
 */
public class MenuCuenta {
    
    public static void main(String[] args){
        
        String titularCuenta;
        String opcionSaldo;
        double saldoActual;
        String opcionMenu;
        double cantidadIngresar;
        boolean controlMenu;
        
        Cuenta miCuenta = new Cuenta();
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el titular de la cuenta: ");
        titularCuenta = scanner.nextLine();
        
        System.out.println("Desa ingresar el saldo: A) SI, B) NO");
        opcionSaldo = scanner.nextLine();
        
        if(opcionSaldo.equals("A")){
            
            System.out.println("Ingrese el sadlo actual: ");
            saldoActual = scanner.nextDouble();
            miCuenta = new Cuenta(titularCuenta, saldoActual);
            
        }else{
            miCuenta = new Cuenta(titularCuenta);
           
        }
       

        
        controlMenu = false;
        while(controlMenu == false){
            
            System.out.println("Seleccione una de las opciones: A)Ingresar, B)Retirar, S)Salir ");
            opcionMenu = scanner.nextLine();
            
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
                controlMenu= true;
            }
            else{
                System.out.println("La opción no es valida");
            }
        }

    }

}
