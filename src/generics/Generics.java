package generics;

public class Generics {
    public static void main(String[] args) {
        Animal a = new Tiger(); // OK
        // Cage<Animal> ca = new Cage<Tiger>(); // COMPILE ERROR
    }
}
