package com.xocs.ap.relaties;

import org.junit.Test;

import static org.junit.Assert.*;

public class KlantTest {

    @Test
    public void addRekening() {

        Klant klant = new Klant();
        assertEquals(0,klant.getAantalRekeningen());

        klant.addRekening(new Rekening("1"));
        assertEquals(1,klant.getAantalRekeningen());

        klant.addRekening(new Rekening("2"));
        assertEquals(2,klant.getAantalRekeningen());

    }

    @Test
    public void getTotaalSaldo() {
        Klant klant = new Klant();

        Rekening rekening1 = new Rekening("1");
        rekening1.setSaldo(22.4);

        Rekening rekening2 = new Rekening("2");
        rekening2.setSaldo(11.4);

        klant.addRekening(rekening1);
        assertEquals(22.4,klant.getTotaalSaldo(),0.000001);

        klant.addRekening(rekening2);
        assertEquals(33.8,klant.getTotaalSaldo(),0.000001);

    }

    @Test
    public void getSaldo() {
        Klant klant = new Klant();

        Rekening rekening1 = new Rekening("1");
        rekening1.setSaldo(22.4);

        Rekening rekening2 = new Rekening("2");
        rekening2.setSaldo(11.4);

        klant.addRekening(rekening1);
        klant.addRekening(rekening2);

        assertEquals(22.4,klant.getSaldo("1"),0.0001);
        assertEquals(11.4,klant.getSaldo("2"),0.0001);
        assertEquals(0.0,klant.getSaldo("5"),0.0001);
    }
}