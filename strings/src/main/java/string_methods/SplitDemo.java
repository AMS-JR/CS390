package string_methods;

public class SplitDemo {
    public static void main(String[] args) {
        String test = "boo:and:foo";
        String[] stringArray = test.split(":");
        for (String s : stringArray) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        String[] stringArray2 = test.split(":", 2);
        for (String s : stringArray2) {
            System.out.println(s);
        }
    }
}
