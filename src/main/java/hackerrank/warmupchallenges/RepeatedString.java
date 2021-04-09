package hackerrank.warmupchallenges;

public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736_778_906_400L));
    }

    public static long repeatedString(String s, long n) {
        long a = 0;
        int temp = (int) (n % (long)s.length());

        System.out.println(temp);
        if (temp != 0) {
            String part = s.substring(0, temp);
            System.out.println(part);
            for (char c1 : part.toCharArray()) {
                if (c1 == 'a') {
                    a++;
                }
            }
        }
        long aa = 0;
        for (char c2 : s.toCharArray()) {
            if (c2 == 'a') {
                aa++;
            }
        }
        System.out.println(aa);
        System.out.println(a);
        return (long) aa * (n / s.length()) + a;
    }
}
