package codewars.breakcamelcase;

public class BreakCamelCase {

    public static void main(String[] args) {
        System.out.println(camelCase("camelCase"));
    }

        public static String camelCase(String input) {
            String result = "";
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == input.toUpperCase().charAt(i)){
                    String [] words = input.split(Character.toString(input.charAt(i)));
                    result = words[0] + " " + input.charAt(i) + words[1];
                }
            }
            return result;
        }
    }
