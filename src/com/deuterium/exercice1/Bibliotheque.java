package com.deuterium.exercice1;

public class Bibliotheque {
    private Document[] documents;
    private int capacite;
    private int lastItemIndex;

    public Bibliotheque(int capacite) {
        if (capacite > 0) {
            this.capacite = capacite;
            this.documents = new Document[capacite];
        } else {
            System.out.println("Error while creating Bib, capacity should not be null or negative");
        }
    }

    public void afficherDocuments() {
        for (var doc :
                documents) {
            System.out.println(doc);
        }
    }

    public Document document(int i) {
        // TODO : improve functionality and error handling
        return documents[i];
    }

    public boolean ajouter(Document doc) {
        boolean status;
        status = false;
        if (this.documents.length < this.capacite) {
            this.documents[this.lastItemIndex] = doc;
            this.lastItemIndex++;
            status = true;
        }
        return status;
    }

    public boolean supprimer(Document doc) {
        // TODO : Implement document deletion
        return false;
    }

    public void afficherAuteurs() {
        for (int i = 0; i < this.documents.length; i++) {
            if (this.documents[i] instanceof Livre) {
                System.out.println(((Livre) this.documents[i]).getAuteur());
            }
        }
    }
}
