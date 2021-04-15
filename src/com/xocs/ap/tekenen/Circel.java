package com.xocs.ap.tekenen;

public class Circel extends Vorm implements Berekenbaar {

    private double radius;

    public Circel(String kleur,double radius) {
        super(kleur);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double oppervlakte() {
        return Math.PI*radius*radius;
    }
}
