package com.radek;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Kniha> knihy = new ArrayList<>();

        knihy.add(new Kniha("Kolotoč", 100));
        knihy.add(new Kniha("Postel", 345));
        knihy.add(new Kniha("Tábor", 432));

//        for (Kniha kniha: knihy){
//            System.out.println(kniha);
//        }
//        System.out.println(knihy);
        Kniha nejtlustsiKniha = knihy.getFirst();
        for (Kniha kniha : knihy) {
            if (nejtlustsiKniha.getPocetStran() < kniha.getPocetStran()) {
                nejtlustsiKniha = kniha;
            }
        }
        System.out.println(nejtlustsiKniha);


    }
}