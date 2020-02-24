package com.deuterium.exercice1;

public class Dictionnaire extends Document {
    public enum LANGUE {
        Anglais,
        Allemand,
        Espagnol
    }
    private LANGUE langue;

    public Dictionnaire(int numero, String titre, LANGUE langue) {
        super(numero, titre);
        this.langue = langue;
    }

    public LANGUE getLangue() {
        return langue;
    }

    public void setLangue(LANGUE langue) {
        this.langue = langue;
    }

    @Override
    public String toString() {
        return "Dictionnaire{" +
                "langue=" + langue +
                ", numero=" + numero +
                ", titre='" + titre + '\'' +
                '}';
    }
}
