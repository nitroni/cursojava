/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author hmunoze
 */
public class Cuenta {
    
    String nombreTitular;
    double saldo=0;
    
   public Cuenta(){

    }
    
    
    public Cuenta(String nombreTitular){
        
       this.nombreTitular = nombreTitular;
    }
    
    
    public Cuenta(String nombreTitular, double saldo){
        
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }
    
    
    public void ingresar(double cantidad){
        
        if(cantidad > 0){
            double ingreso = this.getSaldo() + cantidad;
            this.setSaldo(ingreso);
            
            System.out.println("El saldo actual es: "+this.getSaldo()+" El nombre del titular es: "+this.getNombreTitular());
        }
    }
    
    public void retirar(double cantidad){
        
        if(cantidad > this.getSaldo()){
            System.out.println("SALDO INSUFICIENTE");
        }
        else{
            
            this.setSaldo((this.getSaldo()-cantidad));
            
            System.out.println("El saldo actual es: "+this.getSaldo()+" El nombre del titular es: "+this.getNombreTitular());
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
