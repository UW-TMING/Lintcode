package Solution0_100;

public class Solution_99 {
	public ListNode findMiddle (ListNode head) {
		ListNode slow = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public ListNode reverse (ListNode head) {
		ListNode p = head;
		ListNode ans = null;
		while (p != null) {
			ListNode temp = p.next;
			p.next = ans;
			ans = p;
			p = temp;
		}
		return ans;
	}
	public void reorderList(ListNode head) {  
        if (head == null || head.next == null || head.next.next == null) return;
        ListNode mid = findMiddle (head);
        ListNode left = head;
        ListNode right = reverse(mid.next);
        mid.next = null;
        while (left != null && right != null) {
        		ListNode temp = left.next;
        		ListNode temp1 = right.next;
        		right.next = temp;
        		left.next = right;
        		left = temp;
        		right = temp1;
        }
    }
}
