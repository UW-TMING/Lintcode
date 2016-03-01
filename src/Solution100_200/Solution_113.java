package Solution100_200;

public class Solution_113 {
	public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode ans = new ListNode(-1);
        ListNode lastNode = ans;
        ListNode p = head;
        boolean flag = false;
        while (p != null && p.next == null) {
        		if (p.val != p.next.val) {
        			if (!flag) {
        				lastNode.next = p;
        				lastNode = p;
        			}
        			else  flag = !flag;
        		} else {
        			flag = true;
        		}
        		p = p.next;
        }
        if (!flag) lastNode.next = p;
        return ans.next;
    }
}
