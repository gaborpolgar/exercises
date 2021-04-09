package hackerrank.introducion;

import java.util.Scanner;

public class SubstringComparisons {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] array = new String[s.length() - (k - 1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.substring(i, i + k);
        }
        java.util.Arrays.sort(array);
        smallest = array[0];
        largest = array[array.length - 1];
        return smallest + "\n" + largest;
    }

}
