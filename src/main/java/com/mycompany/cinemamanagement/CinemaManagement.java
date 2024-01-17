/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cinemamanagement;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class CinemaManagement {

    public static void main(String[] args) {
        Cinema c1 =new Cinema();
      
       Film film1= new Film(1,"film1","R1");
       Film film2= new Film(2,"film2","R2");

       SalleNormal saleN1=new SalleNormal(1,"sale1",100);
       c1.Ajouter(film1);
       c1.Ajouter(saleN1);
       c1.Ajouter(new Seance(new Date(),film1,saleN1));
       
       c1.acheter(film1);
       c1.acheter(film1);
       c1.acheter(film1);
       
        try {
            System.out.println(c1.consulter("film"));
        } catch (PlaceIndisponibleException ex) {
            Logger.getLogger(CinemaManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(c1.chifreAfaire());
    }
}
