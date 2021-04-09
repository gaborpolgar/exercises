package hackerrank.warmupchallenges;

public class CountingValleys {

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    public static int countingValleys(int steps, String path) {
        int traverse = 0;
        int altitude = 0;
        boolean inValleys = false;
        for (char c : path.toCharArray()) {
            if (c == 'U') {
                altitude++;
            } else {
                altitude--;
            }
            if (altitude < 0 && !inValleys) {
                traverse++;
                inValleys = true;
            } else if (altitude >= 0 && inValleys) {
                inValleys = false;
            }
        }
        return traverse;
    }
}
