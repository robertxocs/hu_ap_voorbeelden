package com.xocs.ap.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dobbelspel {

    //Dobbelsteen dobbelsteen1 = new Dobbelsteen();
    //Dobbelsteen dobbelsteen2 = new Dobbelsteen();

    Set<Dobbelsteen> dobbelstenen = new HashSet<>();

    public Dobbelspel(int aantal) {
        for ( int i = 0; i < aantal;i++) {
            dobbelstenen.add(new Dobbelsteen(6));
        }
    }

    public void speel() {
        for (Dobbelsteen dobbelsteen : dobbelstenen ) {
            dobbelsteen.gooi();
        }
    }

    @Override
    public String toString() {
        String uitkomst = "waarden: ";

        for (Dobbelsteen dobbelsteen : dobbelstenen ) {
            uitkomst += " " + dobbelsteen.getWaarde();
        }
        return uitkomst;
    }

    public static void main(String [] args) {


        Dobbelspel dobbelspel = new Dobbelspel(7);
        System.out.println(dobbelspel);

        dobbelspel.speel();

        System.out.println(dobbelspel);
    }

}
