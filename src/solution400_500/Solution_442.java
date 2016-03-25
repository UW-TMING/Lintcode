package solution400_500;

import java.util.HashMap;

class TrieNode {
    // Initialize your data structure here.
	public HashMap<Character, TrieNode> hm;
	public String str;
	public boolean flag;
    public TrieNode() {
    		hm = new HashMap<Character, TrieNode> ();
    		str = "";
    		flag = false;
    }
}
public class Solution_442 {
	
	public static void main (String[] args) {
		Solution_442 test = new Solution_442 ();
		test.insert("abc");
		System.out.println (test.search("abcd"));
	}
	
	private TrieNode root;

    public Solution_442() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
    		if (word == null || word.length() == 0) return;
    		TrieNode tn = root;
        for (int i = 0; i < word.length(); i ++) {
        		char c = word.charAt(i);
        		if (!tn.hm.containsKey(c)) {
        			TrieNode temp = new TrieNode();
        			tn.hm.put(c, temp);
        		}
        		tn = tn.hm.get(c);
        }
        tn.flag = true;
        tn.str = word;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
    		if (word == null || word.length() == 0) return false;
    		TrieNode tn = root;
    		for (int i = 0; i < word.length(); i ++) {
    			char c = word.charAt(i);
    			if (!tn.hm.containsKey(c)) {
        			return false;
        		}
        		tn = tn.hm.get(c);
    		}
    		return tn.flag;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
    		if (prefix == null || prefix.length() == 0) return false;
		TrieNode tn = root;
		for (int i = 0; i < prefix.length(); i ++) {
			char c = prefix.charAt(i);
			if (tn.flag) {
				return true;
			}
			if (!tn.hm.containsKey(c)) {
    				return false;
    			}
    			tn = tn.hm.get(c);
		}
		return tn.flag;
    }
}
