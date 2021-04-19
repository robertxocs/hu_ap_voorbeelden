package com.xocs.ap.tekenen;


import java.util.ArrayList;
import java.util.List;

public class Tekening {

    public static void main(String [] args) {


        List<Berekenbaar> berekenbaarList = new ArrayList<>();

        berekenbaarList.add(new Circel("geel",5.3));
        berekenbaarList.add(new Circel("geel",0.3));
        berekenbaarList.add(new Circel("geel",8.3));
        berekenbaarList.add(new Circel("rood",1.3));
        berekenbaarList.add(new Rechthoek("rood",1,1));
        berekenbaarList.add(new Rechthoek("rood",2,3));

        berekenbaarList.forEach(b -> {
            System.out.println("Class: " + b.getClass());
            printOppervlak(b);
        });

        System.out.println("Som van alle oppervlakken is " + berekenbaarList.stream().mapToDouble(b -> b.oppervlakte()).sum());

    }


    public static void printOppervlak(Berekenbaar berekenbaar) {
        System.out.println("Opervlak van deze vorm is " + berekenbaar.oppervlakte());
    }




}
