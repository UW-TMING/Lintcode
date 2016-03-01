package Solution100_200;

public class Solution_112 {
	public static ListNode deleteDuplicates(ListNode head) { 
		if (head == null) return null;
        ListNode ans = new ListNode(-1);
        ListNode lastNode = ans;
        ListNode p = head;
        boolean flag = false;
        while (p.next == null) {
        		if (!flag) {
        			lastNode.next = p;
        			lastNode = p;
        		}
        		if (p.val == p.next.val) flag = true;
        		else flag = false;
        		p = p.next;
        }
        if (!flag) {
        		lastNode.next = p;
			lastNode = p;
        }
        lastNode.next = null;
        return ans.next;
    }  
}
