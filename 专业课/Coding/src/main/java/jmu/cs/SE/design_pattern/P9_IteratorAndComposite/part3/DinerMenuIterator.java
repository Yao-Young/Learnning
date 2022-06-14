package jmu.cs.SE.design_pattern.P9_IteratorAndComposite.part3;

import jmu.cs.SE.design_pattern.P9_IteratorAndComposite.part1.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.menuItems = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }
//
//    public void remove() {
//        if(position <= 0) {
//            throw new IllegalStateException
//                    ("You can't remove an item util you've done at least on next()");
//        }
//        if(menuItems[position-1] != null) {
//            for (int i = 0; i < (menuItems.length - 1); i++) {
//                menuItems[i] = menuItems[i+1];
//            }
//            menuItems[menuItems.length-1] = null;
//        }
//
//    }
}
