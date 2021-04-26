package arraysexercises;

public class EvensFirst {

    public int[] evenBeforeOdd(int[] ints) {
        int[] result = new int[ints.length];
        int[] even = new int[ints.length];
        int[] odd = new int[ints.length];
        int i = 0;
        int j = 0;
        for (int anInt : ints) {
            if (anInt % 2 == 0) {
                even[i] = anInt;
                i++;
            } else {
                odd[j] = anInt;
                j++;
            }
        }
        System.arraycopy(result, 0, even, 0, i);
        System.arraycopy(result, 0, odd, i, j);

        return result;
    }
}
