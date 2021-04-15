package com.xocs.ap.domain;

import java.util.Random;

public class Dobbelsteen {

    private Random random = new Random();


    // Dit is het aantal vlakken
    private int aantalVlakken;

    /*
     * Dit is een waarde
     */
    private int waarde;

    public Dobbelsteen() {
        this(6);
    }

    public Dobbelsteen(int aantalVlakken) {
        this.aantalVlakken = aantalVlakken;
    }

    void gooi() {
        waarde = random.nextInt(aantalVlakken) + 1;
    }

    public int getAantalVlakken() {
        return aantalVlakken;
    }

    /**
     * Geeft waarde van waarde.
     * @return de huidige waarde
     */
    public int getWaarde() {
        return waarde;
    }

    @Override
    public String toString() {
        return "Dobbelsteen{" +
                "waarde=" + waarde +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dobbelsteen that = (Dobbelsteen) o;

        return waarde == that.waarde;
    }

    @Override
    public int hashCode() {
        return waarde;
    }
}
