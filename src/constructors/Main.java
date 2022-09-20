package constructors;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setFirstName("soonho");
        developer.setLastName("yoon");
        // Developer{firstName='soonho', lastName='yoon', languages=null}
        System.out.println(developer);

        Developer mary = new Developer("Mary", "Smith");
        // Developer{firstName='Mary', lastName='Smith', languages=null}
        System.out.println(mary);

        Developer marcus = new Developer("Marcus", "Johnson", Arrays.asList("Java", "JavaScript"));
        // Developer{firstName='Marcus', lastName='Johnson', languages=[Java, JavaScript]}
        System.out.println(marcus);
    }
}
