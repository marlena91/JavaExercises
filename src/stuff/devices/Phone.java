package stuff.devices;

import stuff.Human;

public class Phone extends Device {

    Double engineVolume;
    Integer value;

    @Override
    public String toString() {
        return "stuff.devices.Phone{" +
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (this == seller.mobile) {
            if (buyer.getCash() >= price) {
                buyer.cash -= price;
                seller.cash += price;

                buyer.mobile = this;
                seller.mobile = null;

                System.out.println(buyer.firstName + " bought a " + this.producer + " from " + seller.firstName);
            } else {
                System.out.println("The buyer does not have the right amount");
            }
        } else {
            System.out.println("The seller does not have the item");
        }
    }
}
