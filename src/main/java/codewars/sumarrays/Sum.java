package codewars.sumarrays;

import java.util.Arrays;

public class Sum {

    public static double sum(double[] numbers) {
        if ( numbers.length == 0){
            return 0;
        }
        double result = 0.0;
        for (double numb : numbers){
            result += numb;
        }
        return result;
    }

    public static double sumClever(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
