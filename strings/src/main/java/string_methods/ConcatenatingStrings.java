package string_methods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcatenatingStrings {
    private static final Logger logger = LoggerFactory.getLogger(ConcatenatingStrings.class);

    public static void main(String[] args) {
        String s1 = "Amadou ";
        String s2 = "Jallow";
        logger.info(s1.concat(s2));

        logger.info(
                "My name is ".concat("Amadou")
        );

        String name = """
                I am a software engineer with 5 years of professional exp
                """;

        logger.info(name);
    }
}
