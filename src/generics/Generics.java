package generics;

import java.util.List;

public class Generics {
    public static void main(String[] args) {
        // Animal a = new Tiger(); // OK
        // Cage<Animal> ca = new Cage<Tiger>(); // COMPILE ERROR

//        Cage<Tiger> ct = new Cage<Tiger>();
//        Cage<Animal> ca = ct; // 이 코드가 가능하다면
//        ca.push(new Lion()); // Lion 또한 Animal 의 자식 클래스이기 때문에 가능
//
//        List<Tiger> tigers = ct.getAll(); // Lion 리스트를 반환하며 이를 Tiger 타입으로 저장하는 것도 가능해야 합니다.

        Zookeeper zk = new Zookeeper();
        Meat m = new Meat();
        Cage<Tiger> ct = new Cage<>();
        // zk.giveMeat(ct, m); // COMPILE ERROR, Cage<Carnivore> 가 Cage<Tiger> 의 상위 타입이 아님.

        // Cage<? extends Carnivore> 타입에
        // Cage<Tiger> 할당 가능
        zk.giveMeat(ct, m);

        // Cage<? extends Carnivore> 타입에
        // Cage<Lion> 할당 가능
        Cage<Lion> cl = new Cage<>();
        zk.giveMeat(cl, m);

    }
}
