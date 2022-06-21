package jmu.cs.DS.tree;
import edu.princeton.cs.algs4.StdOut;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Huffman {

    private Node root;

    private static class Node<T> {
        int data;
        Node left;
        Node right;
        Node parent;
        public Node(int item) {
            this.data = item;
        }
        public Node() {}
    }

    public Huffman(int[] items) {

        int len = items.length;
        Node[] list = new Node[len];
        Node first, second, parent;

        PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.data - o2.data;
            }
        });

        for(int i = 0; i < len; ++i) {
            list[i] = new Node(items[i]);
            queue.add(list[i]);
        }

        for(int i = 0; i < len-1; i++) {
            first = queue.poll();
            second = queue.poll();
            System.out.println(first.data + " " + second.data);
            parent = merge(first, second);
            queue.add(parent);
        }
        root = queue.peek();
    }

    private Node merge(Node left, Node right) {
        Node parent = new Node();
        parent.data = left.data + right.data;
        parent.left = left; parent.right = right;
        left.parent = parent; right.parent = parent;
        return parent;
    }

    public void preTravel(Node root) {
        if(root == null) return;
        StdOut.print(root.data + " ");
        preTravel(root.left);
        preTravel(root.right);
    }

    public void preTravel() {
        preTravel(root);
    }


}
