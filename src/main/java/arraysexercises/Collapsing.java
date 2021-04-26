package arraysexercises;

public class Collapsing {

    public int[] collapse(int[] numbers) {
        int length = numbers.length;

        int [] result;
        if (length%2 == 0){
            result = new int[numbers.length/2];
        } else{
            result = new int[length/2+1];
            result[length/2] = numbers[length-1];
        }
        for (int i = 0; i < length/2; i++) {
            result[i] = numbers[i*2] + numbers[i*2+1];
        }
        return result;
    }
}
