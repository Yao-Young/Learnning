package Gym.CCCC;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class TimeP {
    int h1, m1, s1;
    int h2, m2, s2;
    public TimeP(int h1, int m1, int s1, int h2, int m2, int s2) {
        this.h1 = h1;
        this.m1 = m1;
        this.s1 = s1;
        this.h2 = h2;
        this.m2 = m2;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "" + h1 + ":" + m1 + ":" + s1 + " - " + h2 + ":" + m2 + ":" + s2;
    }
}

class MyComparator implements Comparator<TimeP> {
    @Override
    public int compare(TimeP o1, TimeP o2) {
        if(o1.h1 == o2.h1) {
            if(o1.m1 == o2.m1) {
                return o1.s1 - o2.s1;
            }
            return o1.m1 - o2.m1;
        }
        return o1.h1 - o2.h1;
    }

}

public class P10 {

    static Scanner in = new Scanner(System.in);

    static boolean D(int h1, int m1, int s1, int h2, int m2, int s2) {
        s1 -= s2;
        m1 -= m2;
        h1 -= h2;
        if(h1*3600 + m1 * 60 + s1 > 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int n, h1, m1, s1, h2, m2, s2;
        String time;
        char[] t;
        n = in.nextInt();
        in.nextLine();

        TimeP[] arr = new TimeP[n];

        for (int i = 0; i < n; i++) {
            time = in.nextLine();
            t = time.toCharArray();
            h1 = (t[0] - '0') * 10 + t[1] - '0';
            m1 = (t[3] - '0') * 10 + t[4] - '0';
            s1 = (t[6] - '0') * 10 + t[7] - '0';
            h2 = (t[11] - '0') * 10 + t[12] - '0';
            m2 = (t[14] - '0') * 10 + t[15] - '0';
            s2 = (t[17] - '0') * 10 + t[18] - '0';
            TimeP tp = new TimeP(h1, m1, s1, h2, m2, s2);
            arr[i] = tp;
        }
        MyComparator comparator = new MyComparator();
        Arrays.sort(arr, comparator);

        int h0 = 0, m0 = 0, s0 = 0;
        for (TimeP tp : arr) {
            h1 = tp.h1; m1 = tp.m1; s1 = tp.s1;
            if (D(h1, m1, s1, h0, m0, s0)) {
                System.out.printf("%02d:%02d:%02d - %02d:%02d:%02d\n", h0, m0, s0, h1, m1, s1);
            }
            h0 = tp.h2; m0 = tp.m2; s0 = tp.s2;
        }
        h1 = 23; m1 = 59; s1 = 59;
        if (D(h1, m1, s1, h0, m0, s0)) {
            System.out.printf("%02d:%02d:%02d - %02d:%02d:%02d\n", h0, m0, s0, h1, m1, s1);
        }
    }

}
/*
用C++写就过了无语
#include <bits/stdc++.h>
using namespace std;
struct TimeP {
    int h1, m1, s1;
    int h2, m2, s2;
};

bool cmp(TimeP o1, TimeP o2) {
    if(o1.h1 == o2.h1) {
        if(o1.m1 == o2.m1) {
            return o1.s1 < o2.s1;
        }
       return o1.m1 < o2.m1;
    }
    return o1.h1 < o2.h1;
}

bool D(int h1, int m1, int s1, int h2, int m2, int s2) {
    s1 -= s2;
    m1 -= m2;
    h1 -= h2;
    if(h1*3600 + m1 * 60 + s1 > 0) return true;
    return false;
}

int main() {
	int n, h1, m1, s1, h2, m2, s2;
	cin >> n;
	TimeP arr[n];

	for(int i = 0; i < n; i++) {
		scanf("%d:%d:%d - %d:%d:%d", &h1, &m1, &s1, &h2, &m2, &s2);
		TimeP tp{h1, m1, s1, h2, m2, s2};
		arr[i] = tp;
	}
	sort(arr, arr+n, cmp);

    int h0 = 0, m0 = 0, s0 = 0;
    for (int i = 0; i < n; ++i) {
    	TimeP tp = arr[i];
        h1 = tp.h1; m1 = tp.m1; s1 = tp.s1;
        if (D(h1, m1, s1, h0, m0, s0)) {
        	printf("%02d:%02d:%02d - %02d:%02d:%02d\n", h0, m0, s0, h1, m1, s1);
        }
        h0 = tp.h2; m0 = tp.m2; s0 = tp.s2;
    }
    h1 = 23; m1 = 59; s1 = 59;
    if (D(h1, m1, s1, h0, m0, s0)) {
        printf("%02d:%02d:%02d - %02d:%02d:%02d\n", h0, m0, s0, h1, m1, s1);
    }

	return 0;
}


 */
