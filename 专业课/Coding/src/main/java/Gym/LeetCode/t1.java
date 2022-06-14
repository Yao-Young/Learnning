package Gym.LeetCode;

import java.util.Scanner;

public class t1 {
    public int minFlipsMonoIncr(String s) {
        int len = s.length();
        int ans = 0x3f3f3f3f;
        int[] p = new int[len+1];

        p[0] = 0;
        for(int i = 0; i < len; i++) {
            p[i+1] = p[i] + s.charAt(i) - '0';
        }

        for(int i = 0; i <= len; i++) {
            ans = Math.min(ans, p[i]+len-i-(p[len]-p[i]));
        }

        return ans;
    }

    public static void main(String[] args) {

    }

}
