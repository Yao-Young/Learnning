package jmu.cs.DS.sort.choose;

import jmu.cs.DS.sort.SortBase;

public class ChooseSort extends SortBase {

    public ChooseSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        for(int i = 0; i < array.length-1; i++) {
            int min = i;
            for(int j = i; j < array.length; j++) {
                if(array[j] < array[i]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }

}
