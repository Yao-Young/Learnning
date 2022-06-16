package jmu.cs.DS;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import jmu.cs.DS.Fundamentals.MyArrayList;
public class main {

    public static void main(String[] args) {
        int n, p;
        n = StdIn.readInt();
        p = StdIn.readInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++)
            list[i] = StdIn.readInt();



        for (int i : list) {
            StdOut.print(i + " ");
        }


//删除重复元素
//        int[] list = {1,1,1,1,1,1,1,1,1,1,1,1};
//        int len = list.length;
//        int k = 1;
//        for(int i = 1; i < len; i++) {
//            if(list[i] != list[i-1]) {
//                list[k] = list[i];
//                k++;
//            }
//        }
//        len = k;
//        for (int i=0; i<len; i++) {
//            System.out.print(list[i] + " ");
//        }

//合并两个有序序列
//        int[] list1 = new int[5];
//        int[] list2 = new int[5];
//        int i = 0, j = 0, index = 0;
//        for(i = 1; i <= 10; i += 2) {
//            list1[index] = i;
//            list2[index++] = i + 1;
//        }
//        i = 0; index = 0;
//        int[] list = new int[10];
//        while(i < 5 && j < 5) {
//            if(list1[i] < list2[j]) {
//                list[index] = list1[i];
//                i++;
//            }
//            else {
//                list[index] = list2[j];
//                j++;
//            }
//            index++;
//        }
//        while(i < 5) list[index++] = list1[i++];
//        while(j < 5) list[index++] = list2[j++];
//
//        for (int item : list) {
//            System.out.print(item + " ");
//        }
    }
}
