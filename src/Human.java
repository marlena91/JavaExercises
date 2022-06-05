import devices.Car;
import devices.Phone;

public class Human {

    String firstName;
    String lastName;
    Integer age;
    Boolean isAlive;
    Double salary;

    Phone mobile;
    Animal pet;
    private Car auto;

    public Human() {
        this.isAlive = true;
    }

    public Double getSalary() {
        System.out.println("The data was checked: " + java.time.LocalDateTime.now());
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("You cannot assign a negative value");
        } else {
            System.out.println("New salary sent");
            System.out.println("Take the annex");
            System.out.println("Don't hide your income");
        }
        this.salary = salary;
    }

    public String getCar() {
        return this.auto.producer + " " + this.auto.model;
    }

    public void setCar(Car car) {
        if (car.value < this.salary) {
            System.out.println("You managed to buy a " + car.producer + " " + car.model + " with cash.");
            this.auto = car;
        } else if (this.salary > (car.value) / 12) {
            System.out.println("devices.Car bought on credit");
            this.auto = car;
        } else {
            System.out.println(this.firstName + ", you can't afford this car.");
            System.out.println("Apply for studies and find a new job or go for a raise");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
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
