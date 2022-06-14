package jmu.cs.DS.Fundamentals;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<T> implements Iterable<T> {

    public Node<T> first;
    public int n;

    public static class Node<T> {
        public T item;
        public Node<T> next;
    }

    public Bag() {
        first = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void add(T item) {
        Node<T> oldFirst = first;
        first = new Node<>();
        first.item = item;
        first.next = oldFirst;
        ++n;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedIterator(first);
    }

    private class LinkedIterator implements Iterator<T> {
        private Node<T> current;

        public LinkedIterator(Node<T> first) {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current!= null;
        }

        @Override
        public T next() {
            if(!hasNext()) throw new NoSuchElementException();
            T item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

    }
}
//用到泛型，自动装箱，迭代器模式
