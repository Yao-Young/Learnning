package jmu.cs.DS.sort.insertion;

import jmu.cs.DS.sort.SortBase;

public class BInsertion extends SortBase {

    public BInsertion(int[] array) {
        this.array = array;
    }

    public void sort() {
        int i, j, tmp;
        for(i = 1; i < array.length; i++) {
            tmp = array[i];
            int low = 0, high = i - 1, mid;
            while(low <= high) {
                mid = (low + high) / 2;
                if(array[mid] > tmp)
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            for(j = i-1; j >= high+1; j--) {
                array[j+1] = array[j];
            }
            array[high+1] = tmp;
         }
    }

}
