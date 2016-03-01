package solution400_500;

public class Solution_452 {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) return null;
		ListNode lastNode = new ListNode (-1);
		ListNode p = head;
		ListNode lastNode1 = lastNode;
		while (p != null) {
			if (p.val != val) {
				lastNode.next = p;
			}
		}
		lastNode.next = null;
		return lastNode1.next;
    }
}
