package com.deuterium.exercice1;

public class Manuel extends Livre {
    private int niveauScolaire;

    public Manuel(int numero, String titre, String auteur, int nbrPage, int niveauScolaire) {
        super(numero, titre, auteur, nbrPage);
        this.niveauScolaire = niveauScolaire;
    }

    public int getNiveauScolaire() {
        return niveauScolaire;
    }

    public void setNiveauScolaire(int niveauScolaire) {
        this.niveauScolaire = niveauScolaire;
    }

    @Override
    public String toString() {
        return "Manuel{" +
                "niveauScolaire=" + niveauScolaire +
                ", auteur='" + auteur + '\'' +
                ", nbrPage=" + nbrPage +
                ", numero=" + numero +
                ", titre='" + titre + '\'' +
                '}';
    }
}
