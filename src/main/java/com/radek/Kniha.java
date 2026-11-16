package com.radek;

public class Kniha {
    String nazev;
    int pocetStran;

    public Kniha(String nazev, int pocetStran) {
        this.nazev = nazev;
        this.pocetStran = pocetStran;
    }

    public String getNazev() {
        return nazev;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    @Override
    public String toString() {
        return "Kniha{" +
                "nazev='" + nazev + '\'' +
                ", pocetStran=" + pocetStran +
                '}';
    }
}
