package SE.design_pattern.P9_IteratorAndComposite.part2;

import SE.design_pattern.P9_IteratorAndComposite.part1.MenuItem;

import java.awt.*;
import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator{
    ArrayList menuItems;
    int position = 0;

    public PancakeHouseIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position);
        position = position + 1;
        return menuItem;
    }
}
