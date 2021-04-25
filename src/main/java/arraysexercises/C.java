package arraysexercises;

public class C {

    public int countInRange(int[] ints, int min, int max) {
        int minIndex = Integer.MAX_VALUE;
        int maxIndex = Integer.MIN_VALUE;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == min) {
                minIndex = i;
                System.out.println(minIndex);
            }  if (ints[i] == max) {
                maxIndex = i;
                System.out.println(maxIndex);
            }
        }
            if(minIndex == Integer.MAX_VALUE || maxIndex == Integer.MIN_VALUE){
            return 3;
        }
        int result = (maxIndex - minIndex)-1;
        System.out.println(result);
        return result;
    }
}
