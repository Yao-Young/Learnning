package jmu.cs.DS.Fundamentals;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OwSingleList<E> implements Iterable<E> {

    private Node<E> head;
    private Node<E> last;
    private int size;

    private class Node<E> {
        E item;
        Node<E> next;
        Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
        Node() {}
    }

    public OwSingleList() {
        head = new Node<E>();
        last = head;
        last.next = head;
    }

    public int size() { return size;}

    public boolean isEmpty() { return head.next == null;}

    public void add(int index, E item) {

    }


    @Override
    public Iterator<E> iterator() {
        return new OwSingelListItr(head);
    }

    private class OwSingelListItr implements Iterator<E> {

        Node<E> current;

        public OwSingelListItr(Node<E> head) {
            this.current = head.next;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            E item = current.item;
            current = current.next;
            return item;
        }
    }



}
