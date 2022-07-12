package jmu.cs.DS.tree;

public class TrieNode {
    public char data;
    public TrieNode[] children = new TrieNode[26];
    public boolean isEnd = false;

    public TrieNode(char data) {
        this.data = data;
    }
}
