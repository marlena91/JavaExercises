package stuff;

import stuff.creatures.Animal;
import stuff.creatures.FarmAnimal;


public class Main {

    public static void main(String[] args) {

        FarmAnimal krowa = new FarmAnimal("cow");

        krowa.name = "Mucka";

        krowa.feed();
        System.out.println("Waga krowy: "+krowa.getWeight());
        krowa.feed(10);
        System.out.println("Waga krowy: "+krowa.getWeight());
        krowa.beEaten();


    }
}
