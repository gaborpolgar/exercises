package arraysexercises;

import java.util.HashMap;
import java.util.Map;

public class Unique {


    public boolean isUnique(int[] ints) {
        if (ints.length == 0) {
            return true;
        }
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int anInt : ints) {
            frequencies.put(anInt, frequencies.containsKey(anInt) ? frequencies.get(anInt) + 1 : 1);
        }
        System.out.println(frequencies.values());
        for (Integer value : frequencies.values()) {
            if (value != 1) {
                return false;
            }
        }
        return true;
    }
}
