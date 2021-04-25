package arraysexercises;

public class Gap {


    public int minGap(int[] ints) {
        if (ints.length < 2){
            return 0;
        }
        int minGap = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length-1; i++) {
            int temp = ints[i+1] - ints[i];
            if (temp < minGap){
                minGap = temp;
            }
        }
        return minGap;
    }
}
