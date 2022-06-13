package stuff.creatures;

import stuff.devices.Car;
import stuff.devices.Electric;
import stuff.devices.Phone;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Human {

    public String firstName;
    public String lastName;
    public Integer age;
    Boolean isAlive;
    public Double cash;

    public Phone mobile;
    public Animal pet;
    public Integer sizeOfGarage;
    public Car[] garage;

    public Human(Integer sizeOfGarage) {
        this.isAlive = true;
        this.sizeOfGarage = sizeOfGarage;
        this.garage = new Car[this.sizeOfGarage];
        this.cash = 1000.00;
    }

    public Double getCash() {
//        System.out.println("The data was checked: " + java.time.LocalDateTime.now());
        return this.cash;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("You cannot assign a negative value");
        } else {
            System.out.println("New salary sent");
            this.cash += salary;
        }
    }

    public void getCar(Integer numberOfPlace) {
            System.out.println(garage[numberOfPlace]);
    }

    public void setCar(Car car, Integer numberOfPlace) {
        if (car.value < this.cash) {
            System.out.println("You managed to buy a " + car.producer + " " + car.model + " with cash.");
            this.garage[numberOfPlace] = car;
            car.addOwner(this.firstName);
        } else if (this.cash > (car.value) / 12) {
            System.out.println("stuff.devices.Car bought on credit");
            this.garage[numberOfPlace] = car;
            car.addOwner(this.firstName);
        } else {
            System.out.println(this.firstName + ", you can't afford this car.");
            System.out.println("Apply for studies and find a new job or go for a raise");
        }
    }

    public Double sumOfCarValues() {
        Double value = 0.00;
        for (Car car: garage) {
            value += car.value;
        }
        return value;
    }

    public void sortCars() {
        System.out.println("Before sorting: " + Arrays.toString(garage));
        Arrays.sort(garage);
        System.out.println("Before sorting: " + Arrays.toString(garage));
    }

//    public void removeCar(Car car) {
//        if (car == this.auto) {
//            this.auto = null;
//        }
//    }

    @Override
    public String toString() {
        return "stuff.devices.Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", cash=" + cash +
                ", mobile=" + mobile +
                ", pet=" + pet +
                ", garage=" + Arrays.toString(garage) +
                '}';
    }
}
