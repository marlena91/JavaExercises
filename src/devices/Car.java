package devices;

import java.util.Objects;

public class Car {
        public final String model;
        public final String producer;
        Double mileage;
        Double engineVolume;
        String color;
        public Double value;

        public Car(String model, String producer, Double value) {
            this.model = model;
            this.producer = producer;
            this.value = value;
            this.mileage = 5000.00;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;

        return car.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, mileage, engineVolume, color, value);
    }

    @Override
    public String toString() {
        return "devices.Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", mileage=" + mileage +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }
}
