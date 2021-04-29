package com.xocs.ap.overerving;

public class Hond {

    private final String ras;
    private final String naam;

    public Hond(String ras, String naam) {
        this.ras = ras;
        this.naam = naam;
    }

    public String getRas() {
        return ras;
    }

    public String getNaam() {
        return naam;
    }

    public void blaf() {
        System.out.println("Blaf");
    }
}
