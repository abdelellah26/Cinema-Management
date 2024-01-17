/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemamanagement;

/**
 *
 * @author Dell
 */
public abstract class Salle {
     protected int numero;
    protected String nom;
    protected int nombrePlace;

    public Salle() {
        super();
    }

    public Salle(int numero, String nom, int nombrePlace) {
        this.numero = numero;
        this.nom = nom;
        this.nombrePlace = nombrePlace;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public int getNombrePlace() {
        return nombrePlace;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNombrePlace(int nombrePlace) {
        this.nombrePlace = nombrePlace;
    }
    
    public abstract double prix();

    @Override
    public String toString() {
        return "Salle{" + "numero=" + numero + ", nom=" + nom + ", nombrePlace=" + nombrePlace + '}';
    }
    
}
