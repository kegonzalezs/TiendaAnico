/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.carrito;


/**
 *
 * @author User
 */
public class administrarCarrito {
    private carrito car;

    public administrarCarrito() {
        car = new carrito();
    }
    
    

    public administrarCarrito(carrito car) {
        this.car = car;
    }

    public carrito getCar() {
        return car;
    }

    public void setCar(carrito car) {
        this.car = car;
    }
    
    
    
    
}
