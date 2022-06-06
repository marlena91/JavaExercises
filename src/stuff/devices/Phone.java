package stuff.devices;

import stuff.creatures.Human;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device {

    static final String DEFAULT_APP_VERSION = "latest";
    static final String DEFAULT_SERVER_ADDRESS = "play.store.com";
    private static final Integer DEFAULT_PORT_NUMBER = 443;
    private static final String DEFAULT_PROTOCOL = "https";

    public Double screenSize;
    public String os;
    Double engineVolume;
    Integer value;

    public Phone(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

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

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            installAnApp(appName);
        }
    }

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }

    public void installAnApp(String appName, String version, String server) {
        try {
            URL url = new URL(DEFAULT_PROTOCOL, server, DEFAULT_PORT_NUMBER, appName + "-" + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL url) {        
        System.out.println("install " + url.getFile() + " from " + url.getHost());

    }

}
