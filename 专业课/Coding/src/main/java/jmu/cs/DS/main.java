package jmu.cs.DS;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;
import jmu.cs.DS.Fundamentals.OwLinkedList;

import java.util.LinkedList;

public class main {


    public static void main(String[] args) {

        OwLinkedList<Integer> list = new OwLinkedList<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.remove(1);

    }
}
