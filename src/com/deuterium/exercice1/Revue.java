package com.deuterium.exercice1;

public class Revue extends Document {
    private int mois;
    private int annee;

    public Revue(int numero, String titre, int mois, int annee) {
        super(numero, titre);
        this.mois = mois;
        this.annee = annee;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Revue{" +
                "mois=" + mois +
                ", annee=" + annee +
                ", numero=" + numero +
                ", titre='" + titre + '\'' +
                '}';
    }
}
