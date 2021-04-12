package com.xocs.ap.domain;

public class Dobbelspel {

    Dobbelsteen dobbelsteen1 = new Dobbelsteen();
    Dobbelsteen dobbelsteen2 = new Dobbelsteen();


    public void speel() {
        dobbelsteen1.gooi();
        dobbelsteen2.gooi();
    }

    @Override
    public String toString() {
        return "Dobbelspel{" +
                "dobbelsteen1=" + dobbelsteen1.getWaarde() +
                ", dobbelsteen2=" + dobbelsteen2.getWaarde() +
                '}';
    }

    public static void main(String [] args) {


        Dobbelspel dobbelspel = new Dobbelspel();
        System.out.println(dobbelspel);
        dobbelspel.speel();

        System.out.println(dobbelspel);
    }

}
