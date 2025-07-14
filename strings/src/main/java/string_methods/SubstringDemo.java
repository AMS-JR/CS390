package string_methods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubstringDemo {
    private static final Logger logger = LoggerFactory.getLogger(ToStringDemo.class);

    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);
    }
}
