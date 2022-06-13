package stuff;

import stuff.creatures.Animal;
import stuff.creatures.FarmAnimal;
import stuff.creatures.Human;
import stuff.devices.*;


public class Main {

    public static void main(String[] args) throws Exception {

        Human marlena = new Human(3);
        marlena.firstName = "Marlena";

        Human smb = new Human (3);
        smb.firstName = "Zdzisiek";


        Car car1 = new Electric("car1", "Electro", 1000.00);
        Car car2 = new Diesel("car2", "Smog", 3000.00);
        Car car3 = new Diesel("car3", "Smog2", 5000.00);
        Car car4 = new Diesel("car4", "Smog2", 5000.00);
        car1.yearOfProduction = 2022;
        car2.yearOfProduction = 1990;
        car3.yearOfProduction = 1995;

        marlena.setSalary(50000.00);
        smb.setSalary(50000.00);

        System.out.println("HERE");
        marlena.setCar(car1,0);

        System.out.println(car1);

        marlena.setCar(car2,1);
        marlena.setCar(car3,2);
        smb.setCar(car4,0);

        System.out.println(car1);
        try {
            car1.sell(marlena, smb, 8000.00);
        }
        catch (Exception e) {
            System.out.println("Nie udało się sprzedać ");
            e.printStackTrace();
        }
        System.out.println(car1);

    }
}
