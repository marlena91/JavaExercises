import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human tadeusz = new Human();
        tadeusz.firstName = "Tadzio";
        tadeusz.lastName = "Norek";
        tadeusz.age = 47;
        tadeusz.mobile = new Phone();

        tadeusz.mobile.producer = "SAMSUNG";

        Car auto1 = new Car("3", "mazda", 25000.00);
        Car auto2 = new Car("3", "mazda", 25000.00);
        Car auto3 = new Car("focus", "ford", 18000.00);

        tadeusz.pet = new Animal("hamster");
        tadeusz.pet.name = "Azor";

        System.out.println("Human: " + tadeusz);

        System.out.println("Tadeusz's pet: " + tadeusz.pet);
        System.out.println("Tadeusz's mobile: " + tadeusz.mobile);

        System.out.println("auto1: " + auto1);
        System.out.println("auto2: " + auto2);
        System.out.println("auto3: " + auto3);
        System.out.println("auto1.equals(auto2): " + auto1.equals(auto2));
        System.out.println("auto1.equals(auto3): " + auto1.equals(auto3));
    }
}
