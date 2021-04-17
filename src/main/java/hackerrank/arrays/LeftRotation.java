package hackerrank.arrays;

import java.util.Arrays;

public class LeftRotation {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(rotLeft(new int[] {1, 2, 3, 4, 5}, 4 )));
        System.out.println(Arrays.toString(rotLeft(new int[] {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97}, 13 )));
//        System.out.println("5, 1, 2, 3, 4");
    }

    public static int[] rotLeft(int[] a, int d) {
        int [] result = new int [a.length];
        for (int i = 0; i < a.length; i++) {
            if (d-i>0){
                result[a.length - (d-i)] = a[i];
            } else {
                result[Math.abs(d-i)] = a[i];
            }
                  System.out.println(i-d);
            System.out.println(Arrays.toString(result));
        }
        return result;
    }
}
