package stuff.devices;

import stuff.creatures.Human;

import java.util.Arrays;
import java.util.Objects;

public abstract class Car extends Device implements Comparable<Car>{
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

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public int compareTo(Car o)
    {
//        return this.yearOfProduction - o.getYearOfProduction();
        return o.getYearOfProduction() - this.yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!Arrays.asList(seller.garage).contains(this)) {
            throw new Exception("Seller does not have the item");
        } if(!Arrays.asList(buyer.garage).contains(null)){
            throw new Exception("Buyer does not have the free place in garage");
        } if (buyer.cash < price) {
            throw new Exception("Buyer does not have enough money");
        } else {
            int sellerGaragePlace = Arrays.asList(seller.garage).indexOf(this);
            seller.garage[sellerGaragePlace] = null;

            for(int i=0; i < buyer.sizeOfGarage; i++){
                if(buyer.garage[i] == null){
                    buyer.garage[i] = this;
                    break;
                }
            }

            buyer.cash -= price;
            seller.cash += price;

            System.out.println(buyer.firstName + " bought a " + this.producer + " from " + seller.firstName);
        }

    }

    public abstract void refuel();
}
