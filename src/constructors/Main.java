package constructors;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setFirstName("soonho");
        developer.setLastName("yoon");
        // Developer{firstName='soonho', lastName='yoon', languages=null}

        // 객체 초기화 후
        // private List<String> languages = new ArrayList<>();
        // Developer{firstName='soonho', lastName='yoon', languages=[]}
        System.out.println(developer);

        Developer mary = new Developer("Mary", "Smith");
        // Developer{firstName='Mary', lastName='Smith', languages=null}
        
        // 생성자에서 languages 추가
        // this(firstName, lastName, Collections.singletonList("Java"));
        // Developer{firstName='Mary', lastName='Smith', languages=[Java]}
        System.out.println(mary);

        Developer marcus = new Developer("Marcus", "Johnson", Arrays.asList("Java", "JavaScript"));
        // Developer{firstName='Marcus', lastName='Johnson', languages=[Java, JavaScript]}
        System.out.println(marcus);
    }
}
