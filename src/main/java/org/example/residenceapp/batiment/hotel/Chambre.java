package org.example.residenceapp.batiment.hotel;

import org.example.residenceapp.batiment.Proprietaire;
import org.example.residenceapp.batiment.bail.Locataire;
import org.example.residenceapp.batiment.bail.Location;

public class Chambre extends Location {

    private Hotel hotel;

    public Chambre() {
        super(null);

    }

    public Chambre(Locataire locataire) {

        super(locataire);
    }

    public Chambre(Locataire locataire, Hotel hotel) {

        super(locataire);
        this.hotel = hotel;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void bail(Locataire locataire) {

        if (hotel.getProprietaire().getIdPersonne() != locataire.getIdPersonne()) {

            super.setLocataire(locataire);

        } else {

            System.out.println("Impossible de faire un bail car le propriétaire et la locataire sont la même personne");
        }

    }

    public Proprietaire getProprietaire(){

        return hotel.getProprietaire();
    }

    @Override
    public String toString() {
        return "Chambre{" +super.toString()+ "} ";
    }
}
