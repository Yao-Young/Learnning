package jmu.cs.DS.sort.insertion;

import jmu.cs.DS.sort.SortBase;

public class DirInsertion extends SortBase {

    public DirInsertion(int[] array) {
        this.array = array;
    }

    public void sort() {
        int i, j, tmp;
        for(i = 1; i < array.length; i++) {
            tmp = array[i];
            for(j = i; j > 0 && tmp < array[j-1]; j--) {
                array[j] = array[j-1];
            }
            array[j] = tmp;
        }


        //使用哨兵，但是下标从1开始
//        int i, j;
//        for(i=2; i<=array.length; i++) {
//            if(array[i] < array[i-1]) {
//                array[0] = array[i];
//                for(j=i-1; array[0]<array[j]; j--) {
//                    array[j+1] = array[j];
//                }
//                array[j+1] = array[0];
//            }
//        }
    }

}
