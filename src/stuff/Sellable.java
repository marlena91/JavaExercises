package stuff;

import stuff.creatures.Human;

public interface Sellable {
    void sell(Human seller, Human buyer, Double price) throws Exception;
}
