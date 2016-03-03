package Solution100_200;

import java.util.HashMap;

public class Solution_134 {
	
	class Node {
		public int key;
		public int val;
		public Node pre;
		public Node next;
		public Node() {}
		public Node(int key, int val) {
			this.key = key;
			this.val = val;
			pre = next = null;
		}
	}
	public int capacity ;
	public HashMap<Integer, Node> hm;
	public Node head;
	public Node tail;
	public Solution_134(int capacity) {
        this.capacity = capacity;
        hm = new HashMap<Integer, Node> ();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.pre = head;
        
        
    }

    public int get(int key) {
    		if (!hm.containsKey(key)) return -1;
    		Node node = hm.get(key);
    		node.pre.next = node.next;
    		node.next.pre = node.pre;
    		
    		node.next = head.next;
        head.next.pre = node;
        head.next = node;
        node.pre = head;
        
        return node.val;
    }

    public void set(int key, int value) {
    		Node node;
        if (hm.containsKey(key)) {
        		node = hm.get(key);
        		node.val = value;
        		node.pre.next = node.next;
        		node.next.pre = node.pre;
        } else if (hm.size() + 1 > this.capacity) {
        		node = new Node(key, value);
            hm.put(key, node);
            Node temp = tail.pre;
    			tail.pre = tail.pre.pre;
    			tail.pre.next = tail;
    			temp = null;
        } else {
        		node = new Node(key, value);
            hm.put(key, node);
        }
        node.next = head.next;
        	head.next.pre = node;
        	head.next = node;
        	node.pre = head;
        	return;
    }
}
