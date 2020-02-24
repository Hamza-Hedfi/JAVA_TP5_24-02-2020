package com.deuterium.exercice1;

public class Roman extends Livre {
    public enum PrixLitteraire {
        GONCOURT,
        MEDICIS,
        INTERALLIE
    }

    private PrixLitteraire prixLitteraire;

    public Roman(int numero, String titre, String auteur, int nbrPage, PrixLitteraire prixLitteraire) {
        super(numero, titre, auteur, nbrPage);
        this.prixLitteraire = prixLitteraire;
    }

    public PrixLitteraire getPrixLitteraire() {
        return prixLitteraire;
    }

    public void setPrixLitteraire(PrixLitteraire prixLitteraire) {
        this.prixLitteraire = prixLitteraire;
    }

    @Override
    public String toString() {
        return "Roman{" +
                "prixLitteraire=" + prixLitteraire +
                ", auteur='" + auteur + '\'' +
                ", nbrPage=" + nbrPage +
                ", numero=" + numero +
                ", titre='" + titre + '\'' +
                '}';
    }
}
