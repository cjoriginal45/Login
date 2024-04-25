/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.Control;
import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class ControladorLogica {
    Control control = new Control();
    
     public void crearUsuario(Usuario x){
        
        control.crearUsuario(x);
    }
    
    public void eliminarUsuario(String id){
        control.eliminarUsuario(id);
    }
    
    public void editarUsuario(Usuario x){
        control.editarUsuario(x);
    }
        
    public Usuario traerUsuario(String id){
        
        return control.traerUsuario(id);
        
    }
    
    public LinkedList<Usuario> ListaUsuario(){
      
        return control.ListaUsuario();
        
    }
    
    //*************************************rol******************************///
    
     public void crearRol(Rol x){
        
        control.crearRol(x);
    }
    
    public void eliminarRol(int id){
        control.eliminarRol(id);
    }
    
    public void editarRol(Rol x){
        control.editarRol(x);
    }
        
    public Rol traerRol(int id){
        
        return control.traerRol(id);
        
    }
    
    public LinkedList<Rol> ListaRol(){
      
        return control.ListaRol();
        
    }
}
