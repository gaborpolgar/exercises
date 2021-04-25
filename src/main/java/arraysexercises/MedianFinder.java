package arraysexercises;

import java.util.Arrays;

public class MedianFinder {

    public double median(int[] ints) {
        Arrays.sort(ints);
        if (ints.length % 2 == 0) {
            return (ints[((ints.length) / 2)-1] + ints[((ints.length) / 2)])/2.0;
        } else {
            return ints[ints.length / 2];
        }
    }
}
