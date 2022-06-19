package jmu.cs.DS.Fundamentals;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue<Item> implements Iterable<Item> {

    public Queue() {}

    public void enqueue(Item item) {}

    public Item dequeue() {return null;}

    public boolean isEmpty() {return true;}

    public int size() {return 0;}

    @Override
    public Iterator<Item> iterator() {
        return null;
    }


    public static void main(String[] args) {
        java.util.Queue queue = new LinkedList();

    }


}
