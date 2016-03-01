package Solution100_200;

public class Solution_167 {
	public ListNode addLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode p1 = l1;
        ListNode p2 = l2;
        int extra = 0;
        ListNode head = new ListNode(-1);
        ListNode point = head;
        while (p1 != null && p2 != null) {
        		int sum = p1.val + p2.val + extra;
        		point.next = new ListNode(sum % 10);
        		extra = sum / 10;
        		p1 = p1.next;
        		p2 = p2.next;
        		point = point.next;
        }
        if (p1 != null) {
        		int sum = p1.val + extra;
        		point.next = new ListNode(sum % 10);
        		extra = sum / 10;
        		p1 = p1.next;
        		point = point.next;
        }
        if (p2 != null) {
	    		int sum = p2.val + extra;
	    		point.next = new ListNode(sum % 10);
	    		extra = sum / 10;
	    		p2 = p2.next;
	    		point = point.next;
        }
        if (extra != 0) {
        		point.next = new ListNode (extra);
        }
        return head;
    }
}
