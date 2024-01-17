/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemamanagement;

/**
 *
 * @author Dell
 */
public class SalleNormal extends Salle{

    public SalleNormal() {
    }

    public SalleNormal(int numero, String nom, int nombrePlace) {
        super(numero, nom, nombrePlace);
    }
    
    @Override
    public double prix() {
        return 30;
    }
    
}
