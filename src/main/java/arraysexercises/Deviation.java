package arraysexercises;

public class Deviation {

    public double standardDeviation(double[] doubles) {
    double n = doubles.length;
    double sum = 0;
    double mean;
        for (int i = 0; i < n; i++) {
            sum+=doubles[i];
        }
        mean = sum/n;
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum+= Math.pow((doubles[i]-mean),2);
        }
        mean = sum/(n-1);
        double deviation= Math.sqrt(mean);
        return deviation;
    }
}
