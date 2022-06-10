package stuff.devices;

import stuff.Sellable;
import stuff.creatures.Human;

public abstract class Device implements Sellable {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public String color;

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void turnOn();

    public abstract void sell(Human seller, Human buyer, Double price) throws Exception;

}
