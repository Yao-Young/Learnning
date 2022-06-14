package jmu.cs.DS.sort.choose;

import jmu.cs.DS.sort.SortBase;

//设置array[0]为哨兵
public class HeapSort extends SortBase {

    int idx;

    public HeapSort(int[] array) {
        this.array = new int[array.length + 1];
        this.array[0] = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            this.array[i+1] = array[i];
        }
        idx = array.length;
    }

    public void sort() {
        heapBuild();
        int[] newA = new int[array.length];
        newA[0] = Integer.MAX_VALUE;
        for(int i = 1; i < array.length; i++) {
            newA[i] = pop();
        }
        array = newA;
    }

    private void heapBuild() {
        int parent, child, tmp;
        for(int i = idx/2; i > 0; i--) {
            tmp = array[i];
            for(parent = i; 2*parent <= idx; parent = child) {
                child = parent * 2;
                if(child < idx && array[child] < array[child+1]) {
                    child++;
                }
                if(tmp >= array[child])
                    break;
                else
                    array[parent] = array[child];
            }
            array[parent] = tmp;
        }
    }

    private int pop() {
        if(idx == 0) return Integer.MIN_VALUE;
        int parent, child, maxItem = array[1];
        int tmp = array[idx--];

        for(parent = 1; 2*parent <= idx; parent = child) {
            child = parent * 2;
            if(child < idx && array[child] < array[child+1]) {
                child++;
            }
            if(tmp >= array[child])
                break;
            else
                array[parent] = array[child];
        }
        array[parent] = tmp;

        return maxItem;
    }

    public void insert(int x) {
        int i = ++idx;
        for(; array[i/2] < x; i /= 2) {
            array[i] = array[i/2];
        }
        array[i] = x;
    }
}
