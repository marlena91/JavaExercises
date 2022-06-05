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

        tadeusz.setSalary(100000.00);
        tadeusz.setCar(auto1);
        tadeusz.auto.turnOn();
        tadeusz.mobile.turnOn();


    }
}
