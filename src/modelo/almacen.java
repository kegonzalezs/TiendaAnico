/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
/**
 *
 * @author User
 */
public class almacen {
    private long id;
    private String nameAlm;
    private String address;
    private int cell;
    private String email;
    protected ArrayList product;

    public almacen() {
        id = 0 ;
        nameAlm = "None";
        address = "None";
        cell = 0;
        email = "None";
        product = new ArrayList<>();
    }

    public almacen(long id, String nameAlm, String address, int cell, String email, ArrayList product) {
        this.id = id;
        this.nameAlm = nameAlm;
        this.address = address;
        this.cell = cell;
        this.email = email;
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameAlm() {
        return nameAlm;
    }

    public void setNameAlm(String nameAlm) {
        this.nameAlm = nameAlm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList getProduct() {
        return product;
    }

    public void setProduct(ArrayList product) {
        this.product = product;
    }
    
    
    
            
    
    
}