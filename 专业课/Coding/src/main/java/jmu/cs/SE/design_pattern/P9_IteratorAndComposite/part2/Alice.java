package jmu.cs.SE.design_pattern.P9_IteratorAndComposite.part2;

import jmu.cs.SE.design_pattern.P9_IteratorAndComposite.part1.MenuItem;

public class Alice {

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Alice(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        System.out.println("\nBREAKFAST");
        printMenu(pancakeIterator);

        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
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
 相比于Part1，我们现在面对新的Menu时，只需要修改两处，新的Menu变量，printMenu
 但是总觉得那里不对，因为我们每次添加一个Menu就要修改代码，这很烦人，使用一个ArrayList存放Menu的接口

 */
