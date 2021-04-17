package hackerrank.strings;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        print("hello", "java");

    }

    public static void print(String A, String B) {
        System.out.println(A.length() + B.length());
        System.out.println((A.compareTo(B) <= 0) ? "No" : "Yes");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
