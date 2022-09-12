package generics;

public class Zookeeper {
    public void giveMeat(Cage<? extends Carnivore> cage, Meat m) {
        // ...
    }
}
