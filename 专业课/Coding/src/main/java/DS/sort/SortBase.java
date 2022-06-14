package DS.sort;

import java.util.Scanner;

public abstract class SortBase {
    Scanner scanner = new Scanner(System.in);
    public int array[];

    public void setArray(int[] array) {
        this.array = array;
    }

    //swap array elements in a and b
    public void swap(int[] array, int a, int b) {
        if(a < 0 || b < 0 || a >= array.length || b >= array.length) {
            System.out.println("out of index!!");
        }
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    //show array info
    public String arrayInfo() {
        int length = array.length;
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for(int i = 0; i < length; i++) {
            sb.append(i == length-1 ? array[i] : array[i]+",");
        }
        sb.append("]");
        return sb.toString();
    }

    public void sort() {}
}
