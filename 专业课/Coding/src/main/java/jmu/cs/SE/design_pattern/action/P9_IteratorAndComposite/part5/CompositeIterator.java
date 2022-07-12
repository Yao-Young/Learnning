package jmu.cs.SE.design_pattern.action.P9_IteratorAndComposite.part5;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()) {
            return false;
        }
        else {
            Iterator iterator = (Iterator) stack.peek();
            if(!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            }
            else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if(menuComponent instanceof Menu) {
                stack.push(((Menu) menuComponent).createIterator());
            }
            return menuComponent;
        }
        else {
            return null;
        }
    }
}
