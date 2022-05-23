import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Human tadeusz = new Human();

        Animal cat = new Animal("cat");
        cat.name = "Luna";

        Animal dog = new Animal("dog");
        dog.name = "Azor";

        tadeusz.auto = new Car("3", "mazda");
        System.out.println("Tadeusz's car: " + tadeusz.auto.producer + " " + tadeusz.auto.model);

        tadeusz.setSalary(15000.00);
        System.out.println("Tadeusz's salary: " + tadeusz.getSalary() + "zl");


    }
}
