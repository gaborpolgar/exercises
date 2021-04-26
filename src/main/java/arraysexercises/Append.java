package arraysexercises;

public class Append {


    public int[] append(int[] a1, int[] a2) {
        int[] result = new int[a1.length+ a2.length];
        System.arraycopy(a1, 0, result, 0, a1.length);
        System.arraycopy(a2, 0, result, a1.length, a2.length);
        return result;
    }
}
