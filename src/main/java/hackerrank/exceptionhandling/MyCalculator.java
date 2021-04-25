package hackerrank.exceptionhandling;

public class MyCalculator {

    public static void main(String[] args) {
        System.out.println(power(3, 5));
        System.out.println(power(2,4 ));
        System.out.println(power(0, 0));
        System.out.println(power(-1, -2));
        System.out.println(power(-1, 3));
    }

    public static long power(int n, int p) {
        try {
            if (n < 0 || p < 0) {
                throw new IllegalArgumentException("n or p should not be negative.");
            } else if (n == 0 && p == 0) {
                throw new IllegalArgumentException("n and p should not be zero.");
            }
        } catch (Exception e){
        }
        return (long) Math.pow((long) n, (long) p);
    }


}

