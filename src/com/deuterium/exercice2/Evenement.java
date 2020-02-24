package com.deuterium.exercice2;

import java.util.Date;

public class Evenement {
    private Date date;
    private String text;

    public Evenement(Date date, String text) {
        this.date = date;
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "date=" + date +
                ", text='" + text + '\'' +
                '}';
    }
}
