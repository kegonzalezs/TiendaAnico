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
public class vendedor {
    private long id;
    private String name;
    private String correo;
    private long goals;
    private long totalSell;

    public vendedor() {
        id = 0;
        name = "Jhon Doe";
        correo = "None";
        goals = 0 ;
        totalSell = 0;
    }

    public vendedor(long id, String name, String correo, long goals, long totalSell) {
        this.id = id;
        this.name = name;
        this.correo = correo;
        this.goals = goals;
        this.totalSell = totalSell;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getGoals() {
        return goals;
    }

    public void setGoals(long goals) {
        this.goals = goals;
    }

    public long getTotalSell() {
        return totalSell;
    }

    public void setTotalSell(long totalSell) {
        this.totalSell = totalSell;
    }
    
    
    
    
}
