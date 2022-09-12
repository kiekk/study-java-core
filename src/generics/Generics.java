package generics;

import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Animal a = new Tiger(); // OK
        // Cage<Animal> ca = new Cage<Tiger>(); // COMPILE ERROR

        Cage<Tiger> ct = new Cage<Tiger>();
//        Cage<Animal> ca = ct; // 이 코드가 가능하다면
//        ca.push(new Lion()); // Lion 또한 Animal 의 자식 클래스이기 때문에 가능
//
//        List<Tiger> tigers = ct.getAll(); // Lion 리스트를 반환하며 이를 Tiger 타입으로 저장하는 것도 가능해야 합니다.
    }
}
