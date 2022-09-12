package finalKeyword;

import java.util.ArrayList;
import java.util.List;

public class Final {
    private final String finalString = "1234";
    public static void main(String[] args) {
        // final 변수는 초기화 후 변경 불가
//        new Final().finalString = "1234";
        // Cannot assign a value to final variable 'finalString

        final List<String> list = new ArrayList<>();
        // 객체 내부의 값을 변경하는 것은 OK
        list.add("1");
        list.remove("1");
//        list = new ArrayList<>();
        // Cannot assign a value to final variable 'list'
    }

    public static void test(final String finalArgument) {
//        finalArgument = "test";
        // Cannot assign a value to final variable 'finalArgument'
    }
}
