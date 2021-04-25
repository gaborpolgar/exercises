package arraysexercises;

public class Evens {

    public double percentEven(int[] ints) {
        double counter = 0;
        for (int anInt : ints) {
            if (anInt%2 == 0){
                counter++;
            }
        }
        if (counter == 0 || ints.length == 0){
            return 0.0;
        }

        return (counter / ints.length)*100.0;
    }
}
