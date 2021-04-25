package hackerrank.bignumber;

import java.math.BigInteger;

public class JavaPrimalityTest {

    public static void main(String[] args) {
    primality("12");
    }

    public static void primality(String n){
                BigInteger integer = new BigInteger(n);
        System.out.println(integer.isProbablePrime(1) ? "prime" : "not prime");
    }
}
