/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.almacen;

/**
 *
 * @author User
 */
public class administrarAlmacen {
    private almacen al;

    public administrarAlmacen() {
        al = new almacen();
    }

    public administrarAlmacen(almacen al) {
        this.al = al;
    }

    public almacen getAl() {
        return al;
    }

    public void setAl(almacen al) {
        this.al = al;
    }
    
    
    
    
}
