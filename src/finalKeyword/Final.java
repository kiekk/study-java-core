package finalKeyword;

public class Final {
    private final String finalString = "1234";
    public static void main(String[] args) {
        // final 변수는 초기화 후 변경 불가
//        new Final().finalString = "1234";
        // Cannot assign a value to final variable 'finalString
    }

    public static void test(final String finalArgument) {
//        finalArgument = "test";
        // Cannot assign a value to final variable 'finalArgument'
    }
}
