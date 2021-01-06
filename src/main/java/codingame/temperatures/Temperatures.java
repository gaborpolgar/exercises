package codingame.temperatures;

import java.lang.reflect.Array;
import java.util.*;

public class Temperatures {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
                numbers.add(t);
                // Write an answer using System.out.println()
                // To debug: System.err.println("Debug messages...");
            }
            if (numbers.isEmpty()){
                System.out.println(0);
            }
            int result = 100;
            List<Integer> positiveNumbs = new ArrayList<>();
            List<Integer> negativeNumbs = new ArrayList<>();
            Collections.sort(numbers);
            for (Integer numb : numbers) {
                if (numb > 0) {
                    positiveNumbs.add(numb);
                } else if (numb < 0) {
                    negativeNumbs.add(numb);
                } else if (numb == 0) {
                    result = numb;
                }
            }
            if (positiveNumbs.size() == 0){
                System.out.println(negativeNumbs.get(negativeNumbs.size()-1));
            }
            if (result != 0) {
                System.out.println(positiveNumbs.get(0) >= negativeNumbs.get(0) ? positiveNumbs.get(0) : negativeNumbs.get(0));
            } else {
                System.out.println(result);
            }
        }
    }
