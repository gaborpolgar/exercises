package codewars;

import java.util.ArrayList;

class BraceChecker {

        public static int countPassengers(ArrayList<int[]> stops) {
            int result = 0;
            for (int [] stop: stops) {
                result += stop[0];
                result -= stop[1];
            }
            return result;
        }
/*
    ArrayList<int[]> list = new ArrayList<int[]>();
    list.add(new int[] {10,0});
    list.add(new int[] {3,5});
    list.add(new int[] {2,5});
    assertEquals(5, metro.countPassengers(list));
}*/

    }
