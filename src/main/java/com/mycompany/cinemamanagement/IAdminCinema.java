/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.cinemamanagement;

/**
 *
 * @author Dell
 */
public interface IAdminCinema {
    public void Ajouter(Film film);
    public void Ajouter(Salle sale);
    public void Ajouter(Seance seance);
    public double chifreAfaire();
    public double taux(Film film);
}
