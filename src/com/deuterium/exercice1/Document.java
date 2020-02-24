package com.deuterium.exercice1;

public class Document {
    protected int numero;
    protected String titre;

    public Document(int numero, String titre) {
        this.numero = numero;
        this.titre = titre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Document{" +
                "numero=" + numero +
                ", titre='" + titre + '\'' +
                '}';
    }
}
