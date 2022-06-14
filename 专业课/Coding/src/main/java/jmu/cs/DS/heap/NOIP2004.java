package jmu.cs.DS.heap;

import java.util.Scanner;

class Heap {

    int idx;
    int[] heap;

    public Heap(int[] heap, int size) {
        this.heap = new int[size + 10];
        for(int i = 0; i < size; i++) {
            this.heap[i+1] = heap[i];
        }
        heap[0] = Integer.MAX_VALUE;
        this.idx = size;
        buildHeap();
//
//        for (int i = 1; i <= idx; i++) {
//            System.out.print(this.heap[i] + " ");
//        }
//        System.out.println();

    }

    private void buildHeap() {
        for(int i = idx/2; i > 0; i--) {
            int parent, child, tmp = heap[i];
            for(parent = i; 2 * parent <= idx; parent = child) {
                child = parent * 2;
                if(child < idx && heap[child+1] < heap[child]) {
                    child++;
                }
                if(tmp < heap[child]) {
                    break;
                }
                else {
                    heap[parent] = heap[child];
                }
            }
            heap[parent] = tmp;
        }
    }

    public int pop() {
        if(idx <= 0) return -1;
        int minItem = heap[1];
        heap[1] = heap[idx--];
        int tmp = heap[1];
        int parent, child;
        for(parent = 1; parent * 2 <= idx; parent = child) {
            child = parent * 2;
            if(child < idx && heap[child+1] < heap[child]) {
                child++;
            }
            if(tmp < heap[child]) {
                break;
            }
            else {
                heap[parent] = heap[child];
            }
        }
        heap[parent] = tmp;
        return minItem;
    }

    public void insert(int x) {
        int i = ++idx;
        for(; heap[i/2] > x; i /= 2) {
            heap[i] = heap[i/2];
        }
        heap[i] = x;
    }

}



public class NOIP2004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n+10];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Heap heap = new Heap(array, n);

        int ans = 0;

        int t1 = 0, t2 = 0;
        while((t1 = heap.pop()) != -1 && (t2 = heap.pop()) != -1) {
            int t = t1 + t2;
            heap.insert(t);
            ans += t;
        }
        System.out.println(ans);





    }

}







