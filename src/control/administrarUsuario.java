/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.usuario;

/**
 *
 * @author User
 */
public class administrarUsuario {
    private usuario usu;

    public administrarUsuario() {
        usu = new usuario();
        
    }

    public administrarUsuario(usuario usu) {
        this.usu = usu;
    }

    public usuario getUsu() {
        return usu;
    }

    public void setUsu(usuario usu) {
        this.usu = usu;
    }
    
    
    
}
