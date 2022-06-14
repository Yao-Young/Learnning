package SE.design_pattern.P9_IteratorAndComposite.part1;

import java.awt.*;
import java.util.ArrayList;

public class Alice {

    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();

    DinerMenu dinerMenu = new DinerMenu();
    MenuItem[] lunchItems = dinerMenu.getMenuItems();

    public void printMenu() {
        printBreakfastMenu();
        printLaunchMenu();
    }

    public void printBreakfastMenu() {
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem =  (MenuItem) breakfastItems.get(i);
            System.out.print(menuItem.getName()+" ");
            System.out.println(menuItem.getPrice()+" ");
            System.out.println(menuItem.getDescription());
        }
    }

    public   void printLaunchMenu() {

        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            if(menuItem == null) continue;
            System.out.print(menuItem.getName()+" ");
            System.out.println(menuItem.getPrice()+" ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printVegetarianMenu() {
    }

    public boolean isItemVegetarian(String name) {
        return true;
    }
}
/*
 要遍历breakfastMenu和launchMenu 需要知道两个Menu的内部数据结构，两个看起来没什么问题
 但是当Menu有100个时，代码复用率极低，且有新的Menu就的改print方法
 1、需要知道依赖类的数据结构->没有体现封装
 2、面对新的需求需要改动的地方比较多

 */
