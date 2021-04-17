package hackerrank.strings;

public class StringTokens {

    public static void main(String[] args) {
        String s = "                   ";
        if(!s.trim().isEmpty()) {
            String[] words = s.trim().split("[^a-zA-Z]+");
            System.out.println(words.length);
            for (String word : words) {
                System.out.println(word.trim());
            }
        } else{
            System.out.println(0);
    }
    }

}
