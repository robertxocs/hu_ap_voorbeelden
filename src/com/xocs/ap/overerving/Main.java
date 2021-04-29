package com.xocs.ap.overerving;

public class Main {

    public static void main (String [] args) {

        // Zinloos
        Hond brutus = new Herdershond("brutus");
        brutus.blaf();
        Hond boef = new Bouvier("Boef");
        Hond fluffy = new Teckel("Fluffy");

        // Gebruik hond
        Hond brutes2 = new Hond("Herdershond","brutus");
        brutes2.blaf();
        Hond max = new Hond("Labrador","max");


    }
}
