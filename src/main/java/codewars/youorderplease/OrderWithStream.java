package codewars.youorderplease;
import java.util.Arrays;
        import java.util.Comparator;

public class OrderWithStream {
    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }
}
