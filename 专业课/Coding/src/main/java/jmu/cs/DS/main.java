package jmu.cs.DS;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import jmu.cs.DS.Fundamentals.MyArrayList;

import java.util.Stack;

public class main {

    private static class Node {
        int n;
        int tag;
        public Node(int n, int tag) {
            this.n = n;
            this.tag = tag;
        }
    }

    public static int P1(int n, int x) {
        if(n == 0)
            return 1;
        else if(n == 1)
            return 2 * x;
        else
            return 2 * x * P1(n-1, x) - 2 * (n - 1) * P2(n-2, x);
    }

    public static int P2(int n, int x) {

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(P(2, 1));
    }
}
