package com.xocs.ap.tekenen;


public class Tekening {

    public static void main(String [] args) {

        Rechthoek rechthoek = new Rechthoek("rood",2.0, 3.0);
        rechthoek.getKleur();

        Vorm vorm = new Vorm("red");

        Circel circel = new Circel("groen" ,2.0);
        circel.getKleur();

        printOppervlak(rechthoek);
        printOppervlak(circel);

        Vorm v = new Circel("D",3.9);
        Circel c = new Circel("D",3.9);
        Berekenbaar b = new Circel("D",3.9);

    }

    public static void printOppervlak(Berekenbaar berekenbaar) {
        System.out.println("Opervlak van deze vorm is " + berekenbaar.oppervlakte());
    }




}
