/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author Henry A.
 */
public class Cuenta {
    
    private String nombreTitular;
    private double saldo=0;
    
    public Cuenta(String nombreTitular){
        
       this.nombreTitular = nombreTitular;
    }
    
    
    public Cuenta(String nombreTitular, double saldo){
        
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }
    
    /**
     * Procedimiento Ingresar cantidad
     * @param cantidad 
     */
    public void ingresar(double cantidad){
        
        if(cantidad >= 0){
            double ingreso = this.getSaldo() + cantidad;
            this.setSaldo(ingreso);
            
            System.out.println(this.getNombreTitular()+" su saldo actual es: "+this.getSaldo());
        }
        else{
            System.out.println("Error, no es posible ingresar una cantidad negativo.");
        }
    }
    
    /**
     * Procedimiento retirar cantidad
     * @param cantidad 
     */  
    public void retirar(double cantidad){
        
        if(cantidad > this.getSaldo()){
            System.out.println("SALDO INSUFICIENTE.");
        }
        else{
            this.setSaldo((this.getSaldo()-cantidad));
            System.out.println(this.getNombreTitular()+" su saldo actual es: "+this.getSaldo());
        }
    }
    
   
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
