package Solution0_100;

public class Solution_98 {
	public ListNode sortList1(ListNode head) {  
        if (head == null) return head;
        ListNode newhead = new ListNode(Integer.MIN_VALUE);
        ListNode p = head;
        while (p != null) {
        		ListNode p1 = newhead;
        		while (p1.next != null) {
        			if (p1.next.val > p.val) {
        				break;
        			}
        			p1 = p1.next;
        		}
        		ListNode temp = p.next;
        		p.next = p1.next;
        		p1.next = p;
        		p = temp;
        }
        return newhead.next;
    }
	public ListNode findMiddle (ListNode head) {
		ListNode fast = head.next;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public ListNode sortList(ListNode head) { 
		if (head == null || head.next == null) return head;
		ListNode mid = findMiddle (head);
		ListNode temp = mid.next;
		mid.next = null;
		ListNode left = sortList(head);
		ListNode right = sortList(temp);
		ListNode ans = new ListNode(-1);
		ListNode p = ans;
		while (left != null && right != null) {
			if (left.val < right.val) {
				p.next = left;
				left = left.next;
			} else {
				p.next = right;
				right = right.next;
			}
			p = p.next;
		}
		if (left != null) p.next = left;
		if (right != null) p.next = right;
		ListNode t = ans.next;
		ans = null;
		return t;
	}
}
