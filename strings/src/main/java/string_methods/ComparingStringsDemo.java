package string_methods;

public class ComparingStringsDemo {
    public static void main(String[] args) {
        String test = "The Early bird catches the worm";
        System.out.println("endsWith and startsWith");
        System.out.println("endsWith worm: " + test.endsWith("worm"));
        System.out.println("startsWith worm: " + test.startsWith("worm"));
        System.out.println("---------------");
        String s1 = "Amadou";
        String s2 = "amadou";
        String s3 = "Amadou";
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));
        System.out.println("s1 compareTo s3: " + s1.compareTo(s3));
        System.out.println("s1 compareToIgnoreCase s2: " + s1.compareToIgnoreCase(s2));
        System.out.println("------------------");
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));

    }
}
