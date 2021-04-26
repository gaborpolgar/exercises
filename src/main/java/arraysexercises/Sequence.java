package arraysexercises;

public class Sequence {


    public int longestSortedSequence(int[] seqs) {
        int longestSeqLth = 0;
        int actualSequ = 0;
        boolean increase = false;

        for (int i = 0; i < seqs.length - 1; i++) {
            if (seqs[i] <= seqs[i + 1]) {
                if (!increase) {
                    actualSequ++;
                    increase = true;
                }
                actualSequ++;
            } else {
                increase = false;
                if (actualSequ > longestSeqLth) {
                    longestSeqLth = actualSequ;
                }
                actualSequ = 0;
            }
        }
        return longestSeqLth;
    }
}
