package DS.sort.change;

import DS.sort.SortBase;

public class QuickSort extends SortBase {

    public QuickSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        int low = 0, high = array.length-1;
        quickSort(low, high);
    }


    public void quickSort(int low, int high) {
        if(low >= high) return;
        int pivot = Partition(low, high);
        quickSort(low, pivot-1);
        quickSort(pivot+1, high);
    }

    private int Partition(int low, int high) {
        int pivot = array[low];
        while(low < high) {
            while(low < high && array[high] >= pivot) high--;
            array[low] = array[high];
            while(low < high && array[low] <= pivot) low++;
            array[high] = array[low];
        }
        array[low] = pivot;
        return low;
    }

}
/*
 每次可以确定的数字为


 */
