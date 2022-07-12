package jmu.cs.SE.design_pattern.action.P9_IteratorAndComposite.part4;

public class Alice {

    MenuComponent allMenus;

    public Alice(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }


}
