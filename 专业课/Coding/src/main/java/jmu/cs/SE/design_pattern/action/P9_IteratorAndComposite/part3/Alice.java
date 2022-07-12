package jmu.cs.SE.design_pattern.action.P9_IteratorAndComposite.part3;

import jmu.cs.SE.design_pattern.action.P9_IteratorAndComposite.part1.MenuItem;

import java.util.Iterator;

public class Alice {

    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Alice(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        System.out.println("\nBREAKFAST");
        printMenu(pancakeIterator);

        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);

        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("\nCAFE");
        printMenu(cafeIterator);

    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName()+" ");
            System.out.println(menuItem.getPrice()+" ");
            System.out.println(menuItem.getDescription());
        }
    }

}
/*
  使用java.util.Iterator来做，人家已经实现好啦
 */
