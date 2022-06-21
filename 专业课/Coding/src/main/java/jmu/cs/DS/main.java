package jmu.cs.DS;

import jmu.cs.DS.tree.Huffman;

import java.util.PriorityQueue;

public class main {


    public static void main(String[] args) {
        int[] a = {7, 5, 2, 4};

        Huffman huffman = new Huffman(a);
        huffman.preTravel();


    }

}
