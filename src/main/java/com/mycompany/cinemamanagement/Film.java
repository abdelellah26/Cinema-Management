/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemamanagement;

/**
 *
 * @author Dell
 */
public class Film {
     private int numero;
    private String titre;
    private String realisateur;

    public Film() {
    }

    public Film(int numero, String titre, String realisateur) {
        this.numero = numero;
        this.titre = titre;
        this.realisateur = realisateur;
    }
    

    public int getNumero() {
        return numero;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    @Override
    public String toString() {
        return "Film{" + "numero=" + numero + ", titre=" + titre + ", realisateur=" + realisateur + '}';
    }
    
    
    
}
