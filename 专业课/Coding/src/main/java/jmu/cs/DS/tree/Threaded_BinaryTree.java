package jmu.cs.DS.tree;


import java.util.Iterator;

public class Threaded_BinaryTree<T> implements Iterable<T> {

    TreeNode<T> root;


    private static class TreeNode<T> {
        T data;
        int ltag, rtag;
        TreeNode<T> leftChild;
        TreeNode<T> rightChild;
        public TreeNode(T item, TreeNode<T> leftChild, TreeNode<T> rightChild) {
            this.data = item;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.ltag = this.rtag = 0;
        }
    }

    //遍历建树
    public Threaded_BinaryTree() {
        TreeNode<T> pre = null;
        if(root != null) {
            createInThread(root, pre);
            pre.rightChild = null;
            pre.rtag = 1;
        }
    }

    public void createInThread(TreeNode<T> current, TreeNode<T> pre) {
        if(current == null) return;
        createInThread(current.leftChild, pre);
        if(current.leftChild == null) {
            current.leftChild = pre;
            current.ltag = 1;
        }
        if(pre != null && pre.rightChild != null) {
            pre.rightChild = current;
            pre.rtag = 1;
        }
        pre = current;
        createInThread(current.rightChild, pre);
    }

    /**
     * 寻找中序下的第一个结点
     * 一直沿root往左子树找
     * @return
     */
    public TreeNode<T> First(TreeNode<T> current) {
        if(current == null) return null;
        TreeNode<T> p = current;
        while(p.ltag == 0) {
            p = p.leftChild;
        }
        return p;
    }

    /**
     * 寻找中序下的最后一个结点
     * 一直沿着root往右子树找
     * @return
     */
    public TreeNode<T> Last(TreeNode<T> current) {
        if(current == null) return null;
        TreeNode<T> p = current;
        while(p.rtag == 0) {
            p = p.rightChild;
        }
        return p;
    }

    public TreeNode<T> Next(TreeNode<T> current) {
        TreeNode<T> p = current.rightChild;
        if(p.rtag == 0) return First(p);
        else return p;
    }

    public TreeNode<T> Prior(TreeNode<T> current) {
        TreeNode<T> p = current.leftChild;
        if(p.ltag == 0) return Last(p);
        else return p;
    }

    public void inOrder() {
        for(TreeNode<T> p = root; p != null; p = Next(p)) {
            //
        }
    }

    public void preOrder() {
        TreeNode<T> p = root;
        while(p != null) {
            //visit(p)
            if(p.ltag == 0) p = p.leftChild;
            else if(p.rtag == 0) p = p.rightChild;
            else {
                while(p != null && p.rtag == 1)
                    p = p.rightChild;
                if(p != null) p = p.rightChild;
            }
        }
    }

    public void postOrder() {
        TreeNode<T> t = root;
        while(t.ltag == 0 || t.rtag == 0) {
            if(t.ltag == 0) t = t.leftChild;
            else if(t.rtag == 0) t = t.rightChild;
        }
        //visit(t)
        TreeNode<T> p;
        while((p = parent(t)) != null) {
            if(p.rightChild == t || p.rtag == 1) {
                t = p;
            }
            else {
                t = p.rightChild;
                while(t.ltag == 0 || t.rtag == 0) {
                    if(t.ltag == 0) t = t.leftChild;
                    else if(t.rtag == 0) t = t.rightChild;
                }
            }
            //visit(t);
        }
    }

    public TreeNode<T> parent(TreeNode<T> current) {
        TreeNode<T> p;
        if(current == root) return null;
        for(p = current; p.ltag == 0; p = p.leftChild);
        if(p.leftChild != null) {
            for(p = p.leftChild; p!= null && p.leftChild!= current && p.rightChild != current;) {
                p = p.rightChild;
            }
        }
        if(p == null || p.leftChild == null) {
            for(p = current; p.rtag == 0; p = p.rightChild);
            for(p = p.rightChild; p != null && p.leftChild != current && p.rightChild != current;) {
                p = p.leftChild;
            }
        }
        return p;
    }

    //插入
    //删除


    @Override
    public Iterator<T> iterator() {
        return null;
    }

}
