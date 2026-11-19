package com.radek;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        ArrayList<Kniha> knihy = new ArrayList<>();

//        knihy.add(new Kniha("Kolotoč", 100));
//        knihy.add(new Kniha("Postel", 345));
//        knihy.add(new Kniha("Tábor", 432));

        Kniha kniha = new Kniha("Kolotoč", 100);
        Kniha kniha1 = new Kniha("Postel", 345);
        Kniha kniha2 = new Kniha("Tábor", 432);

        knihy.add(kniha);
        knihy.add(kniha1);
        knihy.add(kniha2);


        for (Kniha k: knihy){
            System.out.println(k);
        }
//        System.out.println(knihy);

        kniha.vyrad();

        System.out.println( "Vypis po vyřazení");

        for (Kniha k: knihy){
            System.out.println(k);
        }


        Kniha nejtlustsiKniha = knihy.getFirst();
        for (Kniha k : knihy) {
            if (nejtlustsiKniha.getPocetStran() < k.getPocetStran()) {
                nejtlustsiKniha = k;
            }
        }
        System.out.println("nejtlustší kniha je: " + nejtlustsiKniha);


    }
}