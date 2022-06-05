package devices;

public class Phone {

    public String producer;
    String model;
    Double millage;
    Double engineVolume;
    String color;
    Integer value;

    @Override
    public String toString() {
        return "devices.Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", millage=" + millage +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }
}
