package com.xocs.ap.overerving;

import com.xocs.ap.tekenen.Berekenbaar;

/**
 * Dit is incorrect want voegt niets toe.
 * Geen nieuwe attributen, geen nieuwe methoden
 */
public class Herdershond extends Hond implements Bewaker {

    public Herdershond(String naam) {
        super("Herder", naam);
    }

    @Override
    public void blaf() {
        System.out.println("bijt");
    }

    @Override
    public void slaAlarm() {
        blaf();
    }
}
