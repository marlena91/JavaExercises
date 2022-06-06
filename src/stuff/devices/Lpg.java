package stuff.devices;

public class Lpg extends Car {
    public Lpg(String model, String producer, Double value) {
        super(model, producer, value);
    }

    @Override
    public void refuel() {
        System.out.println("refuel");
    }
}
