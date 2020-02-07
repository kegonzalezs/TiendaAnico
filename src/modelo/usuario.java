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
public class usuario {
    private long id;
    private String name;
    private String pass;
    private long cardNumber;
    private boolean quota;
    private long debt;
    private String state;
    private String type;
    private ArrayList cars;
    

    public usuario() {
        id = 123;
        name = "Jhon Doe";
        pass = "456";
        cardNumber = 14;
        quota = true;
        debt = 0;
        state = "Afiliado";
        type = "Afiliado";
        cars = new ArrayList();
    }

    public usuario(long id, String name, String pass, long cardNumber, boolean quota, long debt, String state, String type, ArrayList cars) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.cardNumber = cardNumber;
        this.quota = quota;
        this.debt = debt;
        this.state = state;
        this.type = type;
        this.cars = cars;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean isQuota() {
        return quota;
    }

    public void setQuota(boolean quota) {
        this.quota = quota;
    }

    public long getDebt() {
        return debt;
    }

    public void setDebt(long debt) {
        this.debt = debt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList getCars() {
        return cars;
    }

    public void setCars(ArrayList cars) {
        this.cars = cars;
    }
    
    
    
    
    
    
    
}
