package codewars;

import java.util.stream.Stream;

public class ShortestWord {

    public static void main(String[] args) {

        System.out.println(findShort("word longest polgargabor"));
    }

    public static  int findShortSimpliest(String s) { {
            return Stream.of(s.split(" "))
                    .mapToInt(String::length)
                    .min()
                    .getAsInt();
        }
    }

        public static int findShort(String s) {

            String [] words = s.split(" ");
            int length = words[0].length();
            for (int i = 1; i< words.length-1; i++){
                if (words [i].length() < length){
                    length = words [i].length();
                }
            }
            return length;
        }
    }
