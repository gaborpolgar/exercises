package hackerrank.warmupchallenges;

import java.sql.Array;
import java.util.Arrays;

public class JumpingOnTheClouds {

    public static int jumpingOnClouds(int[] c) {
        int minJumps = 0;
        boolean isJumped = false;
        for (int i = 1; i < c.length; i++) {
            if (i == c.length-1){
                minJumps++;
                break;
            }
            if (!isJumped) {
                isJumped = true;
                continue;
            } else if (isJumped && c[i] == 1){
                minJumps += 2;
                i++;
                isJumped = false;
                continue;
            } else {
                minJumps++;
                isJumped = false;
            }
        }
        return minJumps;
    }
}
