package Solution0_100;

class ListNode {
	int val;
	ListNode next;
	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Solution_96_2 {
	public ListNode partition(ListNode head, int x) {
		if (head == null) {
			return null;
		}
		ListNode leftHead = new ListNode(0);
		ListNode rightHead = new ListNode (0);
		ListNode left = leftHead;
		ListNode right = rightHead;
		while (head != null) {
			if (head.val < x) {
				left.next = head;
				left = head;
			} else {
				right.next = head;
				right = head;
			}
			head = head.next;
		}
		right.next = null;
		left.next = rightHead.next;
		return leftHead.next;
	}
}
