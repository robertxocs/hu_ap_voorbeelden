package taal;

public class Zwembad {

    private double diepte;
    private double breedte;
    private double lengte;

    public Zwembad(double diepte, double breedte, double lengte) {
        this.diepte = diepte;
        this.breedte = breedte;
        this.lengte = lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    @Override
    public String toString() {
        return "Zwembad{" +
                "diepte=" + diepte +
                ", breedte=" + breedte +
                ", lengte=" + lengte +
                '}';
    }
}
