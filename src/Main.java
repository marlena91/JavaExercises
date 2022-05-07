import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.name = "Luna";
        cat.weight = 3.2;

        System.out.println(cat.name);
        System.out.println("Waga kota: " + cat.weight + "kg");

    }
}
