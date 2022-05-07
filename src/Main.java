import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("cat");
        cat.name = "Luna";

        System.out.println();
        System.out.println(cat.name + " weight: " + cat.getWeight() + "kg.");


        Animal dog = new Animal("dog");
        dog.name = "Azor";

        System.out.println(dog.name + " weight: " + dog.getWeight() + "kg.");

        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();


    }
}
