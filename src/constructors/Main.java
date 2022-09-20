package constructors;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setFirstName("soonho");
        developer.setLastName("yoon");
        // Developer{firstName='soonho', lastName='yoon', languages=null}
        System.out.println(developer);
    }
}
