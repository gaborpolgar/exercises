package hackerrank.strings;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(stringReverse("anagram", "Margana"));
    }

    public static boolean stringReverse(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char c1[]=a.toCharArray();
        char c2[]=b.toCharArray();
        java.util.Arrays.sort(c1);
        java.util.Arrays.sort(c2);
        a=String.valueOf(c1);
        b=String.valueOf(c2);

        if(a.equalsIgnoreCase(b))
            return true;
        else
            return false;
    }
}
