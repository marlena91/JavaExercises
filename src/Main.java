import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Human tadeusz = new Human();

        Animal cat = new Animal("cat");
        cat.name = "Luna";

        Animal dog = new Animal("dog");
        dog.name = "Azor";


        tadeusz.setSalary(45000.00);
        System.out.println("Tadeusz's salary: " + tadeusz.getSalary() + "zl");

        tadeusz.setCar(new Car("6", "mazda", 25000.00));
        System.out.println("Tadeusz's car: " + tadeusz.getCar());

    }
}
