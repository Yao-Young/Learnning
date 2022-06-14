import edu.princeton.cs.algs4.StdOut;
import jmu.cs.DS.Fundamentals.Bag;

import java.util.Iterator;

public class test {

    public static void main(String[] args) {

        Bag<String> bag = new Bag<>();
        bag.add("yzy");
        bag.add("zzz");
        StdOut.println("size = " + bag.size());

        Iterator it = bag.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
