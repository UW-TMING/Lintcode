package Solution100_200;

import java.util.HashMap;

class RandomListNode {
	int label;
	RandomListNode next, random;
	RandomListNode(int x) { this.label = x; }
}
public class Solution_105 {
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) return null;
		HashMap<RandomListNode, RandomListNode> hm = new HashMap<RandomListNode, RandomListNode> ();
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode pre = dummy;
        RandomListNode p = head;
        RandomListNode newNode = null;
        while (p != null) {
        		if (hm.containsKey(p)) {
        			newNode = hm.get(p);
        		} else {
        			newNode = new RandomListNode(p.label);
        			hm.put(p, newNode);
        		}
        		pre.next = newNode;
        		if(p.random != null) {
        			if (hm.containsKey(p.random)) {
        				newNode.random = hm.get(p.random);
        			} else {
        				newNode.random = new RandomListNode(p.random.label);
        				hm.put(p.random, newNode.random);
        			}
        		}
        		pre = newNode;
        		p = p.next;
        }
        return dummy.next;
    }
}
