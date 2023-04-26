/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author User
 */
public class dtoEducacion {
    @NotBlank
      private String nombreE;
    @NotBlank
    private String descriptionE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descriptionE) {
        this.nombreE = nombreE;
        this.descriptionE = descriptionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescriptionE() {
        return descriptionE;
    }

    public void setDescriptionE(String descriptionE) {
        this.descriptionE = descriptionE;
    }
    
}
