package codewars.quarteroftheyear;

public class QuarterOf {

    public static void main(String[] args) {
        System.out.println(quarterOf(8));
    }

    public static int quarterOf(int month) {
        switch (month) {
            case 1, 2, 3:
                return 1;
            case 4, 5, 6:
                return 2;
            case 7, 8, 9:
                return 3;
            case 10, 11, 12:
                return 4;
            default:
                return 0;
        }
    }

    public static int quarterOfClever(int month) {
        return (int) Math.ceil(month/3.0);
    }
}