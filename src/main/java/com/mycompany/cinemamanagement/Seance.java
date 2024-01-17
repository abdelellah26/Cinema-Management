/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemamanagement;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Seance {
    private Date date;
    private Film film;
    private Salle sale;
    private int nombrePlaceVendu;
    public Seance() {
    }

    public Seance(Date date, Film film, Salle sale) {
        this.date = date;
        this.film = film;
        this.sale = sale;
    }

    public Date getDate() {
        return date;
    }

    public Film getFilm() {
        return film;
    }

    public Salle getSale() {
        return sale;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setSale(Salle sale) {
        this.sale = sale;
    }


    public int getNombrePlaceVendu() {
        return nombrePlaceVendu;
    }

    public void setNombrePlaceVendu(int nombrePlaceVendu) {
        this.nombrePlaceVendu = nombrePlaceVendu;
    }

    @Override
    public String toString() {
        return "Seance{" + "date=" + date + ", film=" + film + ", sale=" + sale + ", nombrePlaceVendu=" + nombrePlaceVendu + '}';
    }
    
}
