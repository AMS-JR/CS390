package string_methods;

public class StringSearchDemo {
    public static void main(String[] args) {
        String test = "The Early bird catches the worm";
        System.out.println("---------------");
        System.out.println("Index of e: " + test.indexOf('e'));
        System.out.println("----------------");
        System.out.println("Last index of e: " + test.lastIndexOf('e'));
        System.out.println("------------------");
        System.out.println("index of bird: " + test.indexOf("bird"));
        System.out.println("------------------");
        System.out.println("index of worm: " + test.lastIndexOf("worm"));
        System.out.println("------------------");
        System.out.println("Contains test case: " + test.contains("bird"));
    }
}
