/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemamanagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Cinema implements IAdminCinema,IUserCinema,IVendureCinema{
    private List<Salle> sales=new ArrayList<Salle>();
    private List<Film> filmes =new ArrayList<Film>();
    private List<Seance> seances=new ArrayList<Seance>();
    @Override
    public void Ajouter(Film film) {
        filmes.add(film);
    }

    @Override
    public void Ajouter(Salle sale) {
        sales.add(sale);
    }

    @Override
    public void Ajouter(Seance seance) {
        seances.add(seance);
    }

    @Override
    public double chifreAfaire() {
         double chiffreAffaire = 0.0;
        for (Seance seance : seances) {
            chiffreAffaire += seance.getNombrePlaceVendu() * seance.getSale().prix();
        }

        return chiffreAffaire;
    }

    @Override
    public double taux(Film film) {
        double t=0;
         for (Seance seance : seances){
             if(seance.getFilm().equals(film)){
                 int nobre=seance.getSale().getNombrePlace();
                 double nombreV=seance.getNombrePlaceVendu();
                 t=nombreV/nobre;
             }
         
         }
        return t;
    }

    @Override
    public Film consulter(String titre) throws PlaceIndisponibleException {
        for (Film film : filmes) {
            if (film.getTitre().equals(titre)) {
                return film;
            }
        }throw new PlaceIndisponibleException(" Film introuvable");
    }

    @Override
    public Salle conculter(int numero) throws PlaceIndisponibleException {
        for(Salle sale : sales){
            if(sale.getNumero()==numero){
                return sale;
            }
        }throw new PlaceIndisponibleException("sale introuvable");
    }
    

    @Override
    public List<Film> consulter() {
        List<Film> filmes=new ArrayList<Film>(); 
        for(Seance seance: seances){
            filmes.add(seance.getFilm());
        }
        return filmes;
    }

    @Override
    public void acheter(Film film) {
        for (Seance sp : seances) {
            if (sp.getFilm().equals(film)) {
                 if(sp.getSale().getNombrePlace()>sp.getNombrePlaceVendu()){
                     int nombreplacevendu =sp.getNombrePlaceVendu();
                      nombreplacevendu +=1;
                      sp.setNombrePlaceVendu(nombreplacevendu);
                 }

            }
        }
    }

    @Override
    public void vendre(Film film, int nombrePlace) {
        for (Seance seance : seances) {
            if (seance.getFilm().equals(film)) {
                int nobreplace=seance.getNombrePlaceVendu()+nombrePlace;
                if(seance.getSale().getNombrePlace()>= nobreplace){
                     seance.setNombrePlaceVendu(nobreplace);

                }  

            }
        }
    }
    
}
