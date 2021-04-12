package taal;

public class Opdrachten {


    public static void main(String[] args) {

        Klant klant1 = new Klant("");
        Klant klant2 = new Klant("");

        klant1.setNaam("ABC");
        klant2.setNaam("Robert");

        System.out.println("Klant1: " + klant1.getNaam());
        System.out.println("Klant2: " + klant2.getNaam());



    }
}
