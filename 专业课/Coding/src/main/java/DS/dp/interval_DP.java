package DS.dp;

import java.util.Arrays;
import java.util.Scanner;

public class interval_DP {
    static int N = 310;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n;
        int[] a = new int[N];
        int[] s = new int[N];
        int[][] f = new int[N][N];

        for(int i = 0; i < N; i++) {
            Arrays.fill(f[i], Integer.MAX_VALUE);
        }
        n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
            s[i] = s[i-1] + a[i];
            f[i][i] = 0;
        }

        for(int len = 2; len <= n; len++) {
            for(int l=1; l+len-1<=n; l++) {
                int r = l + len -1;
                for(int k=l; k<r; k++) {
                    f[l][r] = Math.min(f[l][r], f[l][k]+f[k+1][r]+s[r]-s[l-1]);
                }
            }
        }
        System.out.println(f[1][n]);
    }
}
