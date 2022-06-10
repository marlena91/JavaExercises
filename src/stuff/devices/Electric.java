package stuff.devices;

import stuff.creatures.Human;

public class Electric extends Car{
    public Electric(String model, String producer, Double value) {
        super(model, producer, value);
    }

    @Override
    public void refuel() {
        System.out.println("refuel");
    }

}
