package generics;

import java.util.List;

public class Zookeeper {
    public void giveMeat(Cage<? extends Carnivore> cage, Meat m) {
        // ...
    }
}
