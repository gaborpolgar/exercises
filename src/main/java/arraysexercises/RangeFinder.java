package arraysexercises;

public class RangeFinder {

    public static int range(int[] ints) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if (ints.length == 1) {
            return 1;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
            if (ints[i] > max) {
                max = ints[i];
            }
        }
        int result = max - min;
        return ++result;
    }
}
