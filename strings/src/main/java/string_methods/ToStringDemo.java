package string_methods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToStringDemo {
    private static final Logger logger = LoggerFactory.getLogger(ToStringDemo.class);

    public static void main(String[] args) {
        int i =  3;
        double d = 2.3;
        String s1 = Integer.toString(i);
        String s2 = Double.toString(d);

        logger.info("s1: " + s1 + "; s2: " + s2 );

        Integer i2 =  13;
        Double d2 = 22.3;
        String s11 = i2.toString();
        String s22 = d2.toString();
        logger.info("s1: " + s11 + "; s2: " + s22 );
    }
}
