/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

/**
 *
 * @author s109e8
 */
public class Factura {

    private String nit;
    private double iva;
    private double valorSubTotal;
    private double valorTotal;
    
    
  
    
    
   public Factura(String nit, double iva, double valorSubTotal, double valorTotal){
       
       this.nit = nit;
       this.iva = iva;
       this.valorSubTotal = valorSubTotal;
       this.valorTotal = valorTotal;
   }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getValorSubTotal() {
        return valorSubTotal;
    }

    public void setValorSubTotal(double valorSubTotal) {
        this.valorSubTotal = valorSubTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
    
}
