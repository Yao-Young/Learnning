package jmu.cs.DS.Fundamentals;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements Iterable<E> {

    private int maxSize = 100;
    public Object[] elements;
    private int last;

    public MyArrayList() {
        elements = new Object[maxSize];
        last = -1;
    }

    //在i后添加元素，i从1开始，0默认为第一位
    public void add(int index, E item) {
        if(index < 0 || index > last + 1)
            throw new UnsupportedOperationException();
        if(last == maxSize-1)
            throw new UnsupportedOperationException();
        for(int i = last; i >= index; i--) {
            elements[i+1] = elements[i];
        }
        elements[index] = item;
        last++;
    }
    public void add(E item) {
        addLast(item);
    }
    public void addFirst(E item) {
        add(0, item);
    }
    public void addLast(E item) {
        add(last+1, item);
    }

    //移除第i位上的元素
    public E remove(int index) {
        if(last == -1)
            throw new NoSuchElementException();
        if(index < 1 || index > last + 1)
            throw new NoSuchElementException();
        E item = (E)elements[index-1];
        for(int i = index; i <= last; i++) {
            elements[i-1] = elements[i];
        }
        last--;
        return item;
    }
    public E removeFirst() {
        return remove(1);
    }
    public E removeLast() {
        return remove(last+1);
    }

    //删除所有为item的元素
    public MyArrayList<Integer> removeItem(E item) {
        MyArrayList<Integer> pos = new MyArrayList<>();
        int jump = 0;
        for(int i = 0; i <= last; i++) {
            if(elements[i].equals(item)) {
                pos.add(i+1);
                jump++;
                continue;
            }
            elements[i-jump] = elements[i];
        }
        last -= jump;
        return pos;
    }
//  法一
//    public void removeItem(E item) {
//        int k = 0;
//        for(int i = 0; i <= last; i++) {
//            if(!elements[i].equals(item)) {
//                elements[k] = elements[i];
//                k++;
//            }
//        }
//        last = k;
//    }


    //逆置
    public void reverse() {
        if(last == -1) return;
        int i = 0, j = last;
        E tmp;
        while(i < j) {
            tmp = (E) elements[i];
            elements[i] = elements[j];
            elements[j] = tmp;
            i++; j--;
        }
    }

    //有序表默认递增
    public void removeValueRange(int s, int t) {
        if (s >= t)
            throw new UnsupportedOperationException();
        if (last == -1)
            throw new NoSuchElementException();
        int start = 0;
        while (start <= last && (int) elements[start] <= s) start++;
        if (start > last)
            throw new NoSuchElementException();

        int jump = 0;
        for (int i = start; i <= last; i++) {
            if ((int) elements[i] < t) {
                jump++;
                continue;
            }
            elements[i - jump] = elements[i];
        }
        last -= jump;
    }





    @Override
    public Iterator<E> iterator() {
        return new ArrayListItr<>();
    }

    private class ArrayListItr<E> implements Iterator<E> {

        private int current;

        public ArrayListItr() {
            current = 0;
        }

        @Override
        public boolean hasNext() {
            return current <= last;
        }

        @Override
        public E next() {
            if(!hasNext())
                throw new NoSuchElementException();
            current++;
            return (E)elements[current-1];
        }
    }

}

/*
 1- 增删改查
 2- 动态增长
 */
