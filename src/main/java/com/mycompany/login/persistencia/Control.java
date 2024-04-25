/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Rol;
import com.mycompany.login.logica.Usuario;
import com.mycompany.login.persistencia.exceptions.NonexistentEntityException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Control {
    UsuarioJpaController userjpa = new UsuarioJpaController();
    RolJpaController roljpa = new RolJpaController();
    
     public void crearUsuario(Usuario x) {
        try {
            userjpa.create(x);
        } catch (Exception ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarUsuario(String id) {
        try {
            userjpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarUsuario(Usuario x) {
        try {
            userjpa.edit(x);
        } catch (Exception ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(String name) {
       return userjpa.findUsuario(name); 
    }

    public LinkedList<Usuario> ListaUsuario() {
        List<Usuario> lista = userjpa.findUsuarioEntities();
        LinkedList<Usuario> listaUsuario = new LinkedList(lista); 
        return listaUsuario;
    }

    //**************************************rol**************************************//
    
     public void crearRol(Rol x) {
        try {
            roljpa.create(x);
        } catch (Exception ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarRol(int id) {
        try {
            roljpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarRol(Rol x) {
        try {
            roljpa.edit(x);
        } catch (Exception ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Rol traerRol(int x) {
       return roljpa.findRol(x); 
    }

    public LinkedList<Rol> ListaRol() {
        List<Rol> lista = roljpa.findRolEntities();
        LinkedList<Rol> listaRol = new LinkedList(lista); 
        return listaRol;
    }
}
