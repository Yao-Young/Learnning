package jmu.cs.SE.design_pattern.P9_IteratorAndComposite.part3;

import jmu.cs.SE.design_pattern.P9_IteratorAndComposite.part1.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class AliceUP {

    ArrayList menus;

    public AliceUP(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator menuIterator = menus.iterator();
        while(menuIterator.hasNext()) {
            Menu menu = (Menu)menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + "--");
            System.out.println(menuItem.getDescription());
        }
    }



}
