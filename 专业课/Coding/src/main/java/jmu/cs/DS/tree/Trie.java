package jmu.cs.DS.tree;

public class Trie {

    private TrieNode root = new TrieNode('/');

    public void insert(String wordArray) {
        TrieNode p = root;

        for (int i = 0; i < wordArray.length(); i++) {
            char ch = wordArray.charAt(i);
            int index = ch - 'a';
            if(p.children[index] == null) {
                TrieNode newNode = new TrieNode(ch);
                p.children[index] = newNode;
            }
            p = p.children[index];
        }
        p.isEnd = true;
    }

    public boolean find(String s, int i) {
        if(i >= s.length()) {
            return true;
        }
        TrieNode p = root;
        int n = s.length();
        for(; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if(p.children[index] == null) {
                return false;
            }
            p = p.children[index];
            if(p.isEnd) {
                if(find(s, i+1)) {
                    return true;
                }
            }
        }
        return false;
    }



}
