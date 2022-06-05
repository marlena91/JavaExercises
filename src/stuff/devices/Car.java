package stuff.devices;

import stuff.Human;

import java.util.Objects;

public class Car extends Device {
    Double mileage;
    Double engineVolume;
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
        return "stuff.devices.Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", mileage=" + mileage +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", value=" + value +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on the engine");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (this == seller.getCar()) {
            if (buyer.getCash() >= price) {
                buyer.cash -= price;
                seller.cash += price;

                buyer.setCar(this);
                seller.removeCar(this);

                System.out.println(buyer.firstName + " bought a " + this.producer + " " + this.model + " from " + seller.firstName);
            } else {
                System.out.println("The buyer does not have the right amount");
            }
        } else {
            System.out.println("The seller does not have the car");
        }
    }
}
