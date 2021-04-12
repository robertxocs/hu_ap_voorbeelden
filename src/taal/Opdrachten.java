package taal;

import java.util.HashSet;
import java.util.Set;

public class Opdrachten {


    public static void main(String[] args) {

        Fiets fiets1 = new Fiets("Gazelle","ebike");
        Fiets fiets2 = new Fiets("Gazelle","mtb");
        Fiets fiets3 = new Fiets("Gazelle","ebike");

        Set<Fiets> fietsen = new HashSet<>();

        fietsen.add(fiets1);

        System.out.println("Set contains fiets 1: " + fietsen.contains(fiets1));
        System.out.println("Set contains fiets 2: " + fietsen.contains(fiets2));
        System.out.println("Set contains fiets 3: " + fietsen.contains(fiets3));

        System.out.println("Fiets 1 == Fiets 3 ?: " + fiets1.equals(fiets3));



    }
}
