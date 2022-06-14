package jmu.cs.DS.sort.change;

import jmu.cs.DS.sort.SortBase;

public class BubbleSort extends SortBase {

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        for(int i = 0; i < array.length-1; i++) {
//            for(int j = 0; j < array.length-1-i; j++) {
//                if(array[j] < array[j+1]) {
//                    swap(array, j, j+1);
//                }
//                if(array[j] > array[j+1]) {
//                    swap(array, j, j+1);
//                }
//            }
            for(int j = array.length-1; j > i; j--) {
                if(array[j] < array[j-1]) {
                    swap(array, j, j-1);
                }
            }
        }
    }
}

/*
 时间复杂度：1 + 2 +  .. + n-1  = n(n-1)/2
 交换次数: 取决起始数列

 冒泡排序的原理在于交换，每一趟选出一个最小或最大值，这取决于比较的方式

 */
