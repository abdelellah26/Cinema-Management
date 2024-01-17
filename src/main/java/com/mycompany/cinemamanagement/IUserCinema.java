/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.cinemamanagement;

import java.util.List;

/**
 *
 * @author Dell
 */
public interface IUserCinema {
    public Film consulter(String titre) throws PlaceIndisponibleException;
    public Salle conculter(int numero) throws PlaceIndisponibleException;
    public List<Film> consulter();
    public void acheter(Film film);
}
