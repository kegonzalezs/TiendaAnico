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
public class carrito {
    private long id;
    private Date date;
    private String state;
    private long priceCar;
    protected ArrayList prod;
    protected ArrayList ven;
    private usuario usua;

    public carrito() {
        id = 123;
        date = new Date();
        state = "None";
        priceCar = 0;
        prod = new ArrayList <> () ;
        ven = new ArrayList<vendedor>() ;
        usua = new usuario();
    }

    public carrito(long id, Date date, String state, long priceCar, ArrayList prod, ArrayList ven, usuario usua) {
        this.id = id;
        this.date = date;
        this.state = state;
        this.priceCar = priceCar;
        this.prod = prod;
        this.ven = ven;
        this.usua = usua;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(long priceCar) { //Este Set necesita ser la suma del array de prod
        this.priceCar = priceCar;
        
    }

    public ArrayList getProd() {
        return prod;
    }

    public void setProd(ArrayList prod) {
        this.prod = prod;
    }

    public ArrayList getVen() {
        return ven;
    }

    public void setVen(ArrayList ven) {
        this.ven = ven;
    }

    public usuario getUsua() {
        return usua;
    }

    public void setUsua(usuario usua) {
        this.usua = usua;
    }
    
    
    
    
    
}
