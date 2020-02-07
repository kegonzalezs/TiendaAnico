/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.vendedor;

/**
 *
 * @author User
 */
public class administrarVendedor {
    private vendedor ven;

    public administrarVendedor() {
        ven = new vendedor();
    }

    public administrarVendedor(vendedor ven) {
        this.ven = ven;
    }

    public vendedor getVen() {
        return ven;
    }

    public void setVen(vendedor ven) {
        this.ven = ven;
    }
    
    
    
}
