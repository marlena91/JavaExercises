public class Animal {
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
}