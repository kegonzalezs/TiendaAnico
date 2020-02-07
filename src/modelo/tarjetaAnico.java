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
public class tarjetaAnico {
    private long id;
    private long balance;
    private int points;
    private long cardNumber;
    private Date dateExp;

    public tarjetaAnico() {
        id = 123;
        balance = 0;
        points = 0;
        cardNumber = 14;
        dateExp = new Date();
    }

    public tarjetaAnico(long id, long balance, int points, long cardNumber, Date dateExp) {
        this.id = id;
        this.balance = balance;
        this.points = points;
        this.cardNumber = cardNumber;
        this.dateExp = dateExp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getDateExp() {
        return dateExp;
    }

    public void setDateExp(Date dateExp) {
        this.dateExp = dateExp;
    }
    
    
    
    
}
