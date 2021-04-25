package arraysexercises;

import java.util.Arrays;

public class Sorter {

//    public static void main(String[] args) {
//        System.out.println(isSorted(new double[]{0.0, 2.2, 5.5}));
//    }

    public static boolean isSorted(double[] doubles) {
        double [] sortedDoubles = doubles.clone();

//        System.out.println(Arrays.toString(sortedDoubles));
//        System.out.println(Arrays.toString(doubles));
        Arrays.sort(sortedDoubles);
//        System.out.println(Arrays.toString(sortedDoubles));
        return Arrays.compare(doubles, sortedDoubles) == 0 ? true : false;
    }
}
