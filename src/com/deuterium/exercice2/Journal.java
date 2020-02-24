package com.deuterium.exercice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Journal extends ArrayList<Evenement> {
    public Journal(int initialCapacity) {
        super(initialCapacity);
    }

    public boolean ajouter(String unText) {
        return super.add(new Evenement(new Date(System.currentTimeMillis()), unText));
    }

    @Override
    public String toString() {
        return Arrays.toString(super.toArray());
    }
}
