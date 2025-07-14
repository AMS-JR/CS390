package string_methods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringLength {
    private static final Logger logger = LoggerFactory.getLogger(StringLength.class);

    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        logger.info(String.valueOf(len));
    }
}
