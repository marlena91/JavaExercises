package devices;

public abstract class Device {
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
