/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author User
 */
public class producto {
    private long price;
    private long cod;
    private String type;
    private String name;
    private int iva;
    private long total;
    private Date date;
    private String marca;
    private String lote;

    public producto() {
        price = 0;
        cod = 0;
        type = "None";
        name = "None";
        iva = 19;
        total = 0;
        date = new Date();
        marca = "None";
        lote = "None";
        
    }

    public producto(long price, long cod, String type, String name, int iva, long total, Date date, String marca, String lote) {
        this.price = price;
        this.cod = cod;
        this.type = type;
        this.name = name;
        this.iva = iva;
        this.total = total;
        this.date = date;
        this.marca = marca;
        this.lote = lote;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
    
    
    
            
    
}
