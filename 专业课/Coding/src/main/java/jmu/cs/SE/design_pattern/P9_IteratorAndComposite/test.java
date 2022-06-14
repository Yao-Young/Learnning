package jmu.cs.SE.design_pattern.P9_IteratorAndComposite;

import jmu.cs.SE.design_pattern.P9_IteratorAndComposite.part4.Alice;
import jmu.cs.SE.design_pattern.P9_IteratorAndComposite.part4.Menu;
import jmu.cs.SE.design_pattern.P9_IteratorAndComposite.part4.MenuComponent;
import jmu.cs.SE.design_pattern.P9_IteratorAndComposite.part4.MenuItem;

public class test {

    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS!", "All Menus combined");

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89
        ));

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanlilla ice cream",
                true,
                1.59
        ));

        dinerMenu.add(dessertMenu);

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        Alice alice = new Alice(allMenus);
        alice.printMenu();
    }



}
