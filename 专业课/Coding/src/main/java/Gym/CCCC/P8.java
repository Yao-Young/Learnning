package Gym.CCCC;

import java.util.Scanner;

public class P8 {

    public static void main(String[] args) {

        int[] A = new int[300];
        int[] B = new int[300];

        int N, K, S;
        int pta, pat;

        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();
        S = in.nextInt();

        for(int i = 0; i < N; i++) {
            pta = in.nextInt();
            pat = in.nextInt();
            if(pat >= S) {
                B[pta]++;
            }
            else {
                A[pta]++;
            }
        }
        int cnt = 0;
        for(int i = 0; i < K; i++) {
            for(int j = 175; j <= 290; j++) {
                if(A[j] > 0) {
                    --A[j];
                    ++cnt;
                    if(B[j] > 0) {
                        --B[j];
                        ++cnt;
                    }
                }
                else {
                    if(B[j] >= 2) {
                        cnt += 2;
                    }
                    else if(B[j] > 0) {
                        cnt += 1;
                    }
                    B[j] -= 2;
                }
            }
        }
        System.out.println(cnt);
    }
}

/*
10 1 0
203 0
169 91
175 88
175 0
175 0
189 0
189 0
189 5
189 9
256 10

 */
