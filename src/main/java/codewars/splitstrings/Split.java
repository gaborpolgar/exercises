package codewars.splitstrings;

import java.util.Arrays;

public class Split {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("a")));
    }

    static String[] solutionClever(String s) {
        return (s + (s.length() % 2 > 0 ? "_" : "")).split("(?<=\\G.{2})");
    }

    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s = s + "_";
        }
        if ( s.length() == 2){
            String [] arr = {s};
            return arr;
        }
            String [] result = new String[s.length()/2];
        for (int i = 0; i < s.length()-2; i += 2) {
            for (int j = 0; j < result.length; j++) {
            result[j] = s.substring(i, i+= 2);
            }
        }
        return result;
        }
}
