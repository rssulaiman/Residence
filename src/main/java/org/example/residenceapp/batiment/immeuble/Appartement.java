package org.example.residenceapp.batiment.immeuble;


import org.example.residenceapp.batiment.Proprietaire;
import org.example.residenceapp.batiment.bail.Locataire;
import org.example.residenceapp.batiment.bail.Location;

public class Appartement extends Location {

    private Immeuble immeuble;

    public Appartement() {
        super(null);

    }

    public Appartement(Locataire locataire) {

        super(locataire);
    }

    public Appartement(Locataire locataire, Immeuble immeuble) {

        super(locataire);
        this.immeuble = immeuble;
    }

    public Immeuble getImmeuble() {
        return immeuble;
    }

    public void setImmeuble(Immeuble immeuble) {
        immeuble = immeuble;
    }


    @Override
    public void bail(Locataire locataire) {

        if (immeuble.getProprietaire().getIdPersonne() != locataire.getIdPersonne()) {

            super.setLocataire(locataire);

        } else {

            System.out.println("Impossible de faire un bail car le propriétaire et la locataire sont la même personne");
        }

    }

    public Proprietaire getProprietaire(){

        return immeuble.getProprietaire();
    }

    @Override
    public String toString() {
        return "Appartement{" +super.toString()+"} ";
    }
}
