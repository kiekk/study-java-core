package stringPool;

public class StringPool {

    public static void main(String[] args) {
        String string1 = "Baeldung";
        String string2 = "Baeldung";
        String string3 = new String("Baeldung");
        String string4 = new String("Baeldung");

        System.out.printf("string1 == string2 : %s\n", (string1 == string2));
        System.out.printf("string2 == string3 : %s\n", (string2 == string3));
        System.out.printf("string3 == string4 : %s\n", (string3 == string4));
        System.out.println("-------------------------------------------------");
        System.out.printf("string1.equals(string2) : %s\n", (string1.equals(string2)));
        System.out.printf("string2.equals(string3) : %s\n", (string2.equals(string3)));
        System.out.printf("string3.equals(string4) : %s\n", (string3.equals(string4)));
    }
}