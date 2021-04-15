package com.xocs.ap.tekenen;

public class Rechthoek extends Vorm implements Berekenbaar {

    private double lengte;
    private double breedte;

    public Rechthoek(String kleur,double lengte, double breedte) {
        super(kleur);
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getBreedte() {
        return breedte;
    }


    @Override
    public double oppervlakte() {
        return lengte*breedte;
    }
}
