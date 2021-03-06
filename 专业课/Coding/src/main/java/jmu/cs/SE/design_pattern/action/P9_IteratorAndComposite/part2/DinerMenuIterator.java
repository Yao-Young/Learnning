package jmu.cs.SE.design_pattern.action.P9_IteratorAndComposite.part2;

import jmu.cs.SE.design_pattern.action.P9_IteratorAndComposite.part1.MenuItem;

public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position;

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
}
