/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class cuenta {
    private comprador com;
    private vendedor ven;
    private ArrayList productos;
    private Date diaVenta;

    public cuenta() {
        com = new comprador();
        ven = new vendedor();
        productos = new ArrayList();
        diaVenta = new Date();
    }

    public cuenta(comprador com, vendedor ven, ArrayList productos, Date diaVenta) {
        this.com = com;
        this.ven = ven;
        this.productos = productos;
        this.diaVenta = diaVenta;
    }

    public comprador getCom() {
        return com;
    }

    public void setCom(comprador com) {
        this.com = com;
    }

    public vendedor getVen() {
        return ven;
    }

    public void setVen(vendedor ven) {
        this.ven = ven;
    }

    public ArrayList getProductos() {
        return productos;
    }

    public void setProductos(ArrayList productos) {
        this.productos = productos;
    }

    public Date getDiaVenta() {
        return diaVenta;
    }

    public void setDiaVenta(Date diaVenta) {
        this.diaVenta = diaVenta;
    }
    
    
    
    
    
            
    
}
