package stuff.creatures;

import stuff.devices.Car;
import stuff.devices.Phone;

public class Human {

    public String firstName;
    public String lastName;
    public Integer age;
    Boolean isAlive;
    Double salary;
    public Double cash;

    public Phone mobile;
    public Animal pet;
    Car auto;

    public Human() {
        this.isAlive = true;
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
        }
        this.cash += salary;
    }

    public Car getCar() {
        return this.auto;
    }

    public void setCar(Car car) {
        if (car.value < this.cash) {
            System.out.println("You managed to buy a " + car.producer + " " + car.model + " with cash.");
            this.auto = car;
        } else if (this.cash > (car.value) / 12) {
            System.out.println("stuff.devices.Car bought on credit");
            this.auto = car;
        } else {
            System.out.println(this.firstName + ", you can't afford this car.");
            System.out.println("Apply for studies and find a new job or go for a raise");
        }
    }

    public void removeCar(Car car) {
        if (car == this.auto) {
            this.auto = null;
        }
    }

    @Override
    public String toString() {
        return "stuff.devices.Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", salary=" + salary +
                ", mobile=" + mobile +
                ", pet=" + pet +
                ", auto=" + auto +
                '}';
    }
}
