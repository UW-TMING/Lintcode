package Solution100_200;

public class Solution_105_2 {
	public void copyNext(RandomListNode head) {
		RandomListNode p = head;
		while (p != null) {
			RandomListNode newNode = new RandomListNode(p.label);
			newNode.next = p.next;
			p.next = newNode;
			newNode.random = p.random;
			p = p.next.next;
		}
	}
	public void copyRandom(RandomListNode head) {
		RandomListNode p = head.next;
		while (p != null) {
			if(p.random != null) {
				p.random = p.random.next;
			}
			p = p.next.next;
		}
	}
	public RandomListNode split (RandomListNode head) {
		RandomListNode p = head;
		RandomListNode newhead = new RandomListNode(0);
		RandomListNode pre = newhead;
		while(p != null) {
			pre.next = p.next;
			pre = p.next;
			p.next = pre.next;
			p = p.next;
		}
		return newhead.next;
	}
	public RandomListNode copyRandomList(RandomListNode head) {
		copyNext(head);
		copyRandom(head);
		return split(head);
	}
}
