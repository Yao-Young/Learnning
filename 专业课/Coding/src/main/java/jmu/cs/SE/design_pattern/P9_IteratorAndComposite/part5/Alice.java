package jmu.cs.SE.design_pattern.P9_IteratorAndComposite.part5;

import java.util.Iterator;

public class Alice {

    Menu allMenus;

    public Alice(Menu allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarian() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n------------");
        while(iterator.hasNext()) {
            MenuComponent component = (MenuComponent)iterator.next();
            try {
                if(component.isVegetarian()) {
                    component.print();
                }
            }
            catch (UnsupportedOperationException e) { }
        }
    }
}
