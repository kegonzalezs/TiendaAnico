/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



/**
 *
 * @author User
 */
public class comprador {
    private long numeroVenta;
    private boolean afiliado;
    private tarjetaAnico ta;

    public comprador() {
        numeroVenta = 0;
        afiliado = false;
        ta = new tarjetaAnico();
    }

    public comprador(long numeroVenta, boolean afiliado, tarjetaAnico ta) {
        this.numeroVenta = numeroVenta;
        this.afiliado = afiliado;
        this.ta = ta;
    }

    public long getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(long numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public boolean isAfiliado() {
        return afiliado;
    }

    public void setAfiliado(boolean afiliado) {
        this.afiliado = afiliado;
    }

    public tarjetaAnico getTa() {
        return ta;
    }

    public void setTa(tarjetaAnico ta) {
        this.ta = ta;
    }
    
    
    
    
}
