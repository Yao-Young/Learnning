package jmu.cs.DS.Fundamentals;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class OwLinkedList<E> implements Iterable<E> {

    private Node<E> first;
    private int nodeCnt;

    private static class Node<E> {
        E item;
        Node next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;           //提醒自己，其实可以不用初始化
        }
    }

    public OwLinkedList() {
        first = null;
        nodeCnt = 0;
    }

    public boolean isEmpty() {
        return nodeCnt == 0;
    }

    public int size() {
        return nodeCnt;
    }

    //add
    public boolean add(E item) {
//        addLast(item);
        return true;
    }

    public void addFirst(E item) {
        Node<E> oldFirst = first;
        first = new Node<>(item, null);
        first.next = oldFirst;
        ++nodeCnt;
    }

    public void addLast(E item) {
        ++nodeCnt;
        if(first == null) {
            first = new Node<>(item, null);
            return;
        }
        Node<E> x = first;
        while(x.next != null)
            x = x.next;
        Node<E> last = new Node<>(item, null);
        x.next = last;
    }

    public void add(int index, E item) {
        if(index < 0 || index > nodeCnt)
            throw new NoSuchElementException();
        if(index == 0) {
            addFirst(item);
        }
        else if(index == nodeCnt) {
            addLast(item);
        }
        else {
            Node<E> current = first;
//            while(index > 1)
            for(int i = index; i > 1; --i)
                current = current.next;
            Node<E> insertion = new Node<>(item, current.next);
            current.next = insertion;
        }
    }
// 0 1 2
    public void addAll(Collection<? extends E> c) {}

    public void addAll(int index, Collection<? extends E> c) {}


    //get

    //set

    //remove
    public E remove() {
        return removeFirst();
    }
    public E removeFirst() {
        if(first == null) {
            throw new NoSuchElementException();
        }
        E item = first.item;
        first = first.next;
        --nodeCnt;
        return item;
    }

    public E removeLast() {    // 0, 1, >= 2
        if(first == null) {
            throw new NoSuchElementException();
        }
        Node<E> x = first;
        E item;
        --nodeCnt;
        if(x != null && x.next == null) {
            item = first.item;
            first = null;
            return item;
        }
        else {
            while(x.next.next!= null) x = x.next;
        }
        item = (E) x.next.item;
        x.next = null;
        return item;
    }

    public E remove(int index) {

        if(index < 0 || index >= nodeCnt)
            throw new NoSuchElementException();

        if(index == 0) {
            return removeFirst();
        }
        else if(index == nodeCnt - 1) {
            return removeLast();
        }

        Node<E> x = first;
        for(int i = 1; i < index; ++i)
            x = x.next;

        E item = (E) x.next.item;
        x.next = x.next.next;
        return item;
    }

    //contain
    public boolean contains(E item) {
        return indexOf(item) != -1;
    }

    public int indexOf(E item) {
        int index = 0;
        if(item == null) {
            for(Node<E> x = first; x != null; x = x.next) {
                if(x.item == null) {
                    return index;
                }
                index++;
            }
        }
        else {
            for(Node<E> x = first; x != null; x = x.next) {
                if(item.equals(x.item)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }
    //peek

    //poll


    @Override
    public Iterator<E> iterator() { return new OwLinkedListItr<>(first); }

    private class OwLinkedListItr<E> implements Iterator<E> {

        Node<E> current;

        public OwLinkedListItr(Node<E> first) { current = first; }

        @Override
        public boolean hasNext() { return current != null; }

        @Override
        public E next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            E item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void forEachRemaining(Consumer<? super E> action) {
            Iterator.super.forEachRemaining(action);
        }
    }



}
