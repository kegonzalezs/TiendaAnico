/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.tarjetaAnico;

/**
 *
 * @author User
 */
public class administrarTarjeta {
    private tarjetaAnico ta;

    public administrarTarjeta() {
        ta = new tarjetaAnico();
    }

    public administrarTarjeta(tarjetaAnico ta) {
        this.ta = ta;
    }

    public tarjetaAnico getTa() {
        return ta;
    }

    public void setTa(tarjetaAnico ta) {
        this.ta = ta;
    }
    
    
}
