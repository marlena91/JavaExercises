package stuff;

import stuff.devices.Car;
import stuff.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human tadeusz = new Human();
        Human karol = new Human();
        tadeusz.firstName = "Tadzio";
        tadeusz.lastName = "Norek";
        tadeusz.age = 47;
        tadeusz.mobile = new Phone();

        tadeusz.mobile.producer = "SAMSUNG";

        karol.firstName = "Karol";
        karol.age = 46;
        karol.pet = new Animal("horse");

        Car auto1 = new Car("3", "mazda", 25000.00);

        tadeusz.setSalary(100000.00);
        tadeusz.setCar(auto1);
        karol.setSalary(60000.00);
        auto1.sell(tadeusz, karol, 20000.00);
        tadeusz.mobile.sell(tadeusz, karol, 500.00);
        karol.pet.sell(karol, tadeusz, 5000.00);
    }
}
