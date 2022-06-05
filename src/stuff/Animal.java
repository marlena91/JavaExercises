package stuff;

public class Animal implements Sellable {
    private static final Double DEFAULT_DOG_WEIGHT = 9.0;
    static final Double DEFAULT_WEIGHT = 5.0;
    static final Double DEFAULT_CAT_WEIGHT = 2.0;
    String name;
    Integer age;
    Boolean isAlive;
    final String species;
    private Double weight;


    public Animal(String species) {
        this.isAlive = true;
        this.age = 1;
        this.species = species;

        switch (this.species) {
            case "cat" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "dog" -> this.weight = DEFAULT_DOG_WEIGHT;
            default -> this.weight = DEFAULT_WEIGHT;
        }
    }

    public Double getWeight() {
        return this.weight;
    }

    void feed() {
        if (!isAlive) {
            System.out.println("You cannot feed a dead dog!");

        } else {
            weight += 1;
            System.out.println(name + " said: Thx for food!");
        }

    }

    void takeForAWalk() {
        if (weight == 0) {
            isAlive = false;
            System.out.println("This dog is dead!");

        } else {
            weight -= 1;
            System.out.println(name + " said: nice walk, thx!");
        }
    }

    @Override
    public String toString() {
        return "stuff.devices.Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (this == seller.pet) {
            if (buyer.getCash() >= price) {
                buyer.cash -= price;
                seller.cash += price;

                buyer.pet = this;
                seller.pet = null;

                System.out.println(buyer.firstName + " bought a " + this.species + " from " + seller.firstName);
            } else {
                System.out.println("The buyer does not have the right amount");
            }
        } else {
            System.out.println("The seller does not have the animal");
        }
    }
}