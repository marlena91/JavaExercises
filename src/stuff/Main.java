package stuff;

import stuff.creatures.Animal;
import stuff.creatures.FarmAnimal;
import stuff.devices.*;


public class Main {

    public static void main(String[] args) {

        Phone nokia = new Phone("6410", "Nokia", 2000);
        nokia.installAnApp("YouTube");

        System.out.println(nokia);

        Car electricCar = new Electric("Electro", "Suzuki", 250000.00);
        Car dieselCar = new Diesel("X", "Suzuki", 250000.00);
        Car lpgCar = new Lpg("Electro", "Suzuki", 250000.00);

        electricCar.refuel();
        dieselCar.refuel();
        lpgCar.refuel();

    }
}
