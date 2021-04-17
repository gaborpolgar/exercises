package hackerrank.strings;

import java.util.Arrays;

public class AlternatingCharacters {

    public static void main(String[] args) {
        System.out.println(alternatingCharacters(new String[]{"5", "AAAA","BBBBB","ABABABAB","BABABA","AAABBB"}));

    }

    public static int[] alternatingCharacters(String[] s) {
        int currentCount = 0;
        int [] result = new int[s.length];
        for (int i=0;i<s.length;i++){
            for (int j=1;j<s[i].length();j++){
                if(s[i].charAt(j-1) == s[i].charAt(j)){
                    currentCount++;
                }
            }
        System.out.println(currentCount);
                result[i] = currentCount;
                currentCount = 0;

        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static int alternatingCharacters(String s) {
        int currentCount = 0;
            for (int j=1;j<s.length();j++){
                if(s.charAt(j-1) == s.charAt(j)){
                    currentCount++;
                }
            }
        return currentCount;
    }
}
