package jmu.cs.OS.Memory;

import edu.princeton.cs.algs4.StdIn;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class Element {
    int pageIdx;
    int useCnt;
    public Element(int pageIdx, int useCnt) {
        this.pageIdx = pageIdx;
        this.useCnt = useCnt;
    }
}

public class LRU {

    public static void main(String[] args) {
        int n, pageSize;

        PriorityQueue<Element> queue = new PriorityQueue<>(new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                return o2.useCnt - o1.useCnt;
            }
        });

        n = StdIn.readInt();
        pageSize = StdIn.readInt();

        int in;
        for(int i = 0; i < n; i++) {
            in = StdIn.readInt();
            Iterator it = queue.iterator();
            while(it.hasNext()) {
                Element e = (Element) it.next();
                if(e.pageIdx == in) {
                    e.useCnt = 0;
                }
            }
        }

    }

}


/*
12 3
2 3 2 1 5 2 4 5 3 2 5 2
        int n, pageSize, in;
//        ArrayList<Integer> pageIdx = new ArrayList<>();
//        ArrayList<Integer> useCnt = new ArrayList<>();
//
        n = StdIn.readInt();
        pageSize = StdIn.readInt();
//        int[][] result = new int[pageSize][n];
//        int[] inpage = new int[n];
//        int[] outpage = new int[n];
//
//        for(int i = 0; i < n; i++) {
//
//            int size = useCnt.size();
//            for (int j = 0; j < size; j++) {
//                useCnt.set(j, useCnt.get(j) + 1);
//            }
//
//            in = StdIn.readInt();
//
//            boolean find = false;
//            if(pageIdx.contains(in)) {
//                int pos = pageIdx.indexOf(in);
//                useCnt.set(pos, 0);
//                find = true;
//            }
//
//            if(!find) {
//
//                inpage[i] = in;
//
//                if(size < pageSize) {
//                    pageIdx.add(in);
//                    useCnt.add(0);
//                }
//                else {
//                    int maxCnt = -1, idx = 0;
//                    for(int j = 0; j < size; j++) {
//                        if(useCnt.get(j) > maxCnt) {
//                            maxCnt = useCnt.get(j);
//                            idx = j;
//                        }
//                    }
////                    System.out.println("淘汰:" + pageIdx.get(idx));
//                    outpage[i] = pageIdx.get(idx);
//                    pageIdx.set(idx, in);
//                    useCnt.set(idx, 0);
//                }
//            }
//            for (int j = 0; j < pageIdx.size(); j++) {
//                result[j][i] = pageIdx.get(j);
//            }
//        }
//
//        String t;
//        for(int i = 0; i < pageSize; i++) {
//            StdOut.printf("%-5s", "p"+i);
//            for(int j = 0; j < n; j++) {
//                t = result[i][j] == 0 ? " " : ""+result[i][j];
//                StdOut.printf("%s ", t);
//            }
//            StdOut.println();
//        }
//        for(int j = 0; j < n + 5; j++) StdOut.print("--");
//        StdOut.println();
//
//        StdOut.printf("%-5s", "in");
//        for(int i = 0; i < n; i++) {
//            StdOut.printf("%s ", inpage[i] == 0 ? " " : ""+inpage[i]);
//        }
//        StdOut.println();
//        for(int j = 0; j < n + 5; j++) StdOut.print("--");
//        StdOut.println();
//
//        StdOut.printf("%-5s", "out");
//        for(int i = 0; i < n; i++) {
//            StdOut.printf("%s ", outpage[i] == 0 ? " " : ""+outpage[i]);
//        }

 */











