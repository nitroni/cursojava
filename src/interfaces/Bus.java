/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author s109e8
 */
public class Bus implements Transportador{

    @Override
    public boolean horarioCumplido() {
        System.out.println("Bus a tiempo, PUNTUAL");
        return true;
    }

    @Override
    public int cantidadPasajeros() {
        System.out.println("Capacidad personas sentadas 40");
        return 40;
    }

    @Override
    public double cantidadCombustible() {
        System.out.println("21 galones de combustible");
        return 21;
    }
}
