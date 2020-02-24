package com.deuterium.exercice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Journal_v2 {
    private ArrayList<Evenement> evenements;

    public Journal_v2() {
        this.evenements = new ArrayList<>();
    }

    public void ajouter(String unText) {
        this.evenements.add(new Evenement(new Date(System.currentTimeMillis()), unText));
    }

    @Override
    public String toString() {
        return "Journal_v2{" +
                "evenements=" + Arrays.toString(evenements.toArray()) +
                '}';
    }
}

//
//    Dans quel cas contrôlez-vous mieux le comportement d’un objet Journal ? Supposez qu’on
//    vous demande d’interdire les suppressions d’événements du journal; est-il facile d’obtenir cela
//    dans la solution A ?
//
