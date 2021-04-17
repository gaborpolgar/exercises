package hackerrank.strings;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args) throws Exception {
        patternSyntaxChecker("[AZ[a-z](a-z)");
    }

    public static void patternSyntaxChecker (String pattern) throws Exception {
        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (PatternSyntaxException pse) {
            System.out.println("Invalid");
        }
    }
}
