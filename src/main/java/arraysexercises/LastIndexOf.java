package arraysexercises;

public class LastIndexOf {

    public int lastIndexOf(int[] numbers, int target) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                result = i;
            }
        }
        return result == 0 ? -1 : result;
    }
}
