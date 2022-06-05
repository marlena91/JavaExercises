package stuff.creatures;

public class FarmAnimal extends Animal implements Edible{
        public FarmAnimal(String species) {
            super(species);
        }

    @Override
    public void beEaten() {
        System.out.println("Yummy");
    }

    @Override
    public void feed(Integer foodWeight) {
        if (!isAlive) {
            System.out.println("You cannot feed a dead animal!");
        } else {
            this.weight += foodWeight;
            System.out.println(name + " said: Thx for food!");
        }
    }

    @Override
    public void feed() {
        if (!isAlive) {
            System.out.println("You cannot feed a dead animal!");
        } else {
            this.weight += 1;
            System.out.println(name + " said: Thx for food!");
        }
    }
}
