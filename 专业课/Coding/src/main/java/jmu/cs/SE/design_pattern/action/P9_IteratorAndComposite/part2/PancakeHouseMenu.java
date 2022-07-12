package jmu.cs.SE.design_pattern.action.P9_IteratorAndComposite.part2;

import jmu.cs.SE.design_pattern.action.P9_IteratorAndComposite.part1.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenu {

    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast",
                "Pancake with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancake with fried eggs, sausage",
                true,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancake made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
