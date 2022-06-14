package jmu.cs.DS.sort.merge;

import jmu.cs.DS.sort.SortBase;

public class MergeSort extends SortBase {
    public MergeSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        mergeSort(0, array.length-1);
    }

    private void mergeSort(int low, int high) {
        if(low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid+1, high);
            merge(low, mid, high);
        }    }

    private void merge(int low, int mid, int high) {
        int i, j, k;
        int[] B = new int[array.length];
        for(i = low; i <= high; i++) {
            B[i] = array[i];
        }

        for(i= low, j = mid+1, k = i; i <= mid && j <= high; k++) {
            if(B[i] <= B[j]) {
                array[k] = B[i++];
            }
            else {
                array[k] = B[j++];
            }
        }
        while(i <= mid) array[k++] = B[i++];
        while(j <= high) array[k++] = B[j++];
    }
}
