package stuff;

import stuff.creatures.Animal;
import stuff.creatures.FarmAnimal;
import stuff.creatures.Human;
import stuff.devices.*;


public class Main {

    public static void main(String[] args) throws Exception {

        Human marlena = new Human(3);
        Human smb = new Human (1);
        Car car1 = new Electric("el3", "Electro", 1000.00);
        Car car2 = new Diesel("super", "Smog", 3000.00);
        Car car3 = new Diesel("super2", "Smog2", 5000.00);
        car1.yearOfProduction = 2022;
        car2.yearOfProduction = 1990;
        car3.yearOfProduction = 1995;

        marlena.setSalary(50000.00);

        marlena.setCar(car1,0);
        marlena.setCar(car2,1);
        marlena.setCar(car3,2);

        try{
            car1.sell(smb, marlena, 8000.00);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
