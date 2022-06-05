package stuff.devices;

import stuff.Sellable;

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
}
