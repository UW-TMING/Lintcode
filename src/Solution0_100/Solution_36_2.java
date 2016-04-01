package Solution0_100;

public class Solution_36_2 {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	public ListNode reverseBetween(ListNode head, int m , int n) {
		if (head == null) return null;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode p = dummy;
		int i = 1;
		for (; i < m; i ++) {
			if (p == null) return dummy.next;
			p = p.next;
		}
		ListNode preNode = p;
		ListNode post = p.next;
		ListNode mNode = post; 
		ListNode nNode = post.next;
		while (nNode != null) {
			
		}
		return null;
	}
}
