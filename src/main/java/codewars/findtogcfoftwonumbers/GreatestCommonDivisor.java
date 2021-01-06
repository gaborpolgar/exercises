package codewars.findtogcfoftwonumbers;

public class GreatestCommonDivisor {

    public static int findGCF(int num1, int num2)
    {
        //code away!
        if (num2 == 0)
        {
            return num1;
        }
        return findGCF(num2, num1 % num2);

    }

    public static int findGCFMy(int num1, int num2)
    {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
