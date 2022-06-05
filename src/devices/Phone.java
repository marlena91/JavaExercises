package devices;

public class Phone extends Device {

    Double engineVolume;
    Integer value;

    @Override
    public String toString() {
        return "devices.Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", value=" + value +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on the phone");
    }
}
