/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 *
 * @author Usuario
 */
@Entity
public class Usuario implements Serializable {
    @Id
    @Column(length = 100) // Especifica la longitud máxima de la columna NOMBRE
    private String nombre;
    
    @NotBlank(message = "La contraseña no puede estar en blanco")
    @Size(min = 8, max = 25, message = "La contraseña debe tener entre 8 y 25 caracteres")
    private String contrasenia;
    @ManyToOne
    @JoinColumn(name="id")
    private Rol rol;

    public Usuario() {
    }

    public Usuario(String nombre, String contrasenia, Rol rol) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

   
   
    
    
}
