package arraysexercises;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mode {

    public int mode(int[] ints) {
        Map<Integer,Integer> arrayToMap = new HashMap();
        for (int anInt : ints) {
            arrayToMap.put(anInt, arrayToMap.containsKey(anInt)? arrayToMap.get(anInt)+1 : 1);
            if (anInt < 0 || anInt > 100){
                throw new IllegalArgumentException("Invalid number");
            }
        }
        System.out.println(arrayToMap);
        int temp = 0;
        int result = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : arrayToMap.entrySet()) {
            if (integerIntegerEntry.getValue() > temp){
                temp = integerIntegerEntry.getValue();
                result = integerIntegerEntry.getKey();
            }
        }
        System.out.println(temp);

        return  result;
    }
}
