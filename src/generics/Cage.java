package generics;

import java.util.ArrayList;
import java.util.List;

public class Cage<T> {
    private final List<T> animals = new ArrayList<>();

    public void push(T animal) {
        animals.add(animal);
    }

    public List<T> getAll() {
        return animals;
    }
}
