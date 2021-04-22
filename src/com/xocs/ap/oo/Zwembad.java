package com.xocs.ap.oo;

public class Zwembad {

    private double lengte;
    private double breedte;
    private double diepte;

    public Zwembad() {
    }

    public Zwembad(double lengte, double breedte, double diepte) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.diepte = diepte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    @Override
    public String toString() {
        return "Zwembad{" +
                "lengte=" + lengte +
                ", breedte=" + breedte +
                ", diepte=" + diepte +
                '}';
    }

    public double inhoud() {
        return lengte * breedte * diepte;
    }
}
