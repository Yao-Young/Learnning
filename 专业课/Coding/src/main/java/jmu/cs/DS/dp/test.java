package jmu.cs.DS.dp;

import java.util.Scanner;

public class test {

    public static void solve_by_dp() {
        Scanner scanner = new Scanner(System.in);
        int[] lis = new int[20];
        int n = scanner.nextInt();

        for(int i=0; i<n; i++) {
            lis[i] = scanner.nextInt();
        }

        int[] dp = new int[100];
        dp[0] = 1;
        for(int i=1; i<n; i++) {
            int maxn = 0;
            for(int j=0; j<i; j++) {
                if(lis[i] > lis[j]) {
                    maxn = maxn > dp[j] ? maxn : dp[j];
                }
            }
            dp[i] = maxn + 1;
        }

        for(int i=0; i<n; i++) {
            System.out.print(dp[i] + " ");
        }
    }



    public static void solve_hui() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int size = s.length();
//        System.out.println("size = " + size);
        int[] dp = new int[1005];

        for(int i=0; i<size; i++) {
            dp[i] = 0;
            int pre = i-1, next = i+1;
            while(pre >= 0 && next < size && s.charAt(pre) == s.charAt(next)) {
                dp[i]++;
                pre--;
                next++;
            }
        }

        int maxn = -1, pos = 0;
        for(int i=0; i<size; i++) {
            if(dp[i] > maxn) {
                maxn = dp[i];
                pos = i;
            }
        }

        int start = pos - maxn;
        int end = pos + maxn;
        for(int i=start; i<=end; i++) {
            System.out.print(s.charAt(i));
        }

    }


    public static void main(String[] args) {
        solve_hui();
    }

}

/*
test:
9
2 7 1 5 6 4 3 8 9
 */
