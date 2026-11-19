package com.radek;

public class Kniha {
    private String nazev;
    private int pocetStran;
    private boolean vyrazena;

    public Kniha(String nazev, int pocetStran) {
        this.nazev = nazev;
        this.pocetStran = pocetStran;
//        this.vyrazena = vyrazena;
    }

    public String getNazev() {
        return nazev;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public boolean isVyrazena() {
        return vyrazena;
    }


    public void  vyrad () {
        this.vyrazena = true;
    }


    @Override
    public String toString() {
        return "Kniha{" +
                "nazev='" + nazev + '\'' +
                ", pocetStran=" + pocetStran +
                ", vyrazena=" + vyrazena +
                '}';
    }
}
