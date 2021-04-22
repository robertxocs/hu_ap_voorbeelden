package com.xocs.ap.oo;

public class Main {


    public static void main(String [] args) {

        Zwembad z1 = new Zwembad(2.3,5.4,55.0);

        Zwembad z2 = new Zwembad();
        z2.setBreedte(22.3);
        z2.setDiepte(2.2);
        z2.setLengte(44.9);

        System.out.println(z1);
        System.out.println(z2);

        System.out.println("Inhoud van zwwembad is " + z1.inhoud());
    }
}
