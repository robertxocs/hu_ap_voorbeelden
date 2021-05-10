package com.xocs.ap.relaties;

public class Rekening {
    private final String id;
    private double saldo;

    public Rekening(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rekening rekening = (Rekening) o;

        return id.equals(rekening.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
