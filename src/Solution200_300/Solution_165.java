package Solution200_300;

class ListNode {
	int val;
	ListNode next;
	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Solution_165 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode ans = new ListNode(-1);
		ListNode ans1 = ans;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while (true) {
        		if (p1 == null || p2 == null) {
        			break;
        		}
        		if (p1.val < p2.val) {
        			ans1.next = p1;
        			p1 = p1.next;
        		} else {
        			ans1.next = p2;
        			p2 = p2.next;
        		}
        		ans1 = ans1.next;
        }
        if (p1 == null) {
        		while (p2 != null) {
        			ans1.next = p2;
        			ans1 = ans1.next;
        			p2 = p2.next;
        		}
        }
        if (p2 == null) {
	    		while (p1 != null) {
	    			ans1.next = p1;
	    			ans1 = ans1.next;
	    			p1 = p1.next;
	    		}
        }
        return ans.next;
    }
}
