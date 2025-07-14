package constructors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharArray {
    private static final Logger logger = LoggerFactory.getLogger(CharArray.class);
    public static void main(String[] args) {
        char[] charArray = {'h','e','l','l','o','.'};
        String helloString = new String(charArray);
        logger.info(helloString);
    }
}
