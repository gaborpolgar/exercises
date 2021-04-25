package arraysexercises;

import java.util.Arrays;

public class KthLargest {


    public int kthLargest(int[] ints, int number) {
        Arrays.sort(ints);
        return ints[ints.length-number-1];
    }
}
