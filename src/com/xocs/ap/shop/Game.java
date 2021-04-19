package com.xocs.ap.shop;

public class Game {

    private final String naam;
    private final int releaseJaar;
    private double prijs;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (releaseJaar != game.releaseJaar) return false;
        return naam != null ? naam.equals(game.naam) : game.naam == null;
    }

    @Override
    public int hashCode() {
        int result = naam != null ? naam.hashCode() : 0;
        result = 31 * result + releaseJaar;
        return result;
    }

    public Game(String naam, int releaseJaar, double prijs) {
        this.naam = naam;
        this.releaseJaar = releaseJaar;
        this.prijs = prijs;
    }

}
