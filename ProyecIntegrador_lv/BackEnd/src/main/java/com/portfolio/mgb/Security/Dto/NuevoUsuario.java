/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Security.Dto;

import com.portfolio.mgb.Security.Enums.RolNombre;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class NuevoUsuario {
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Set<RolNombre> roles= new HashSet<>();
    
    //setter y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   public Set<RolNombre> getRoles() {
        return roles;
    }

    public void setRoles(Set<RolNombre> roles) {
        this.roles = roles;
    }
    
}
 //public Set<String> getRoles() {
  //      return roles;}

  //  public void setRoles(Set<String> roles) {
    //    this.roles = roles;}