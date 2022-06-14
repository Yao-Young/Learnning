package DS.sort.insertion;

import DS.sort.SortBase;

public class ShellSort extends SortBase {

    public ShellSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        int i, j, dk;
        for(dk = array.length/2; dk >= 1; dk /= 2) {
            for(i = dk; i < array.length; i += dk) {
                if(array[i] < array[i-dk]) {
                    int tmp = array[i];
                    for(j = i; j >= dk && tmp < array[j-dk]; j -= dk) {
                        array[j] = array[j-dk];
                    }
                    array[j] = tmp;
                }
            }
        }
    }

}
