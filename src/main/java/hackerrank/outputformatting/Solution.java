package hackerrank.outputformatting;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1234));
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf(s1);
            for(int j= s1.length(); j<=15;j++){
                System.out.printf(" ");
            }
            if (Integer.toString(x).length() < 3){
                System.out.printf("0");
            }
            System.out.println(x);
        }
        System.out.println("================================");
    }
}

