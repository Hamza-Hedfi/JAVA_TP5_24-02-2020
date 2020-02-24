package com.deuterium.exercice1;

public class Livre extends Document {
    protected String auteur;
    protected int nbrPage;

    public Livre(int numero, String titre, String auteur, int nbrPage) {
        super(numero, titre);
        this.auteur = auteur;
        this.nbrPage = nbrPage;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbrPage() {
        return nbrPage;
    }

    public void setNbrPage(int nbrPage) {
        this.nbrPage = nbrPage;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "auteur='" + auteur + '\'' +
                ", nbrPage=" + nbrPage +
                ", numero=" + numero +
                ", titre='" + titre + '\'' +
                '}';
    }
}
