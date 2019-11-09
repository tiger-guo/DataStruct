package Tree;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description:Trie树实现
 * @date: 2019/11/6
 */
public class Trie {

    private TrieNode root = new TrieNode('/');

    private class TrieNode {
        public char data;
        public TrieNode[] children = new TrieNode[26];
        public boolean isEndingChar = false;

        public TrieNode(char data) {
            this.data = data;
        }
    }

    public void insert(char[] text) {
        TrieNode p = root;
        for (int i = 0; i < text.length; i++) {
            int index = text[i] - 'a';
            if (p.children[index] == null) {
                p.children[index] = new TrieNode(text[i]);
            }
            p = p.children[index];
        }
        p.isEndingChar = true;
    }

    public boolean find(char[] text) {
        TrieNode p = root;
        for (int i = 0; i < text.length; i++) {
            int index = text[i] - 'a';
            if (p.children[index] == null)
                return false;
            p = p.children[index];
        }
        if (p.isEndingChar == true)
            return true;
        else
            return false;
    }
}
