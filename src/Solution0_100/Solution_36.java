package Solution0_100;

public class Solution_36 {
	public ListNode reverseBetween(ListNode head, int m , int n) {
		if (m > n || m < 1 || head == null) return head;
        int count = 0;
        ListNode p = head;
        ListNode start = null;
        ListNode res = null;
        boolean flag = false;
        while (p != null) {
        		if (count == m - 1)  {
        			start = p;
        			flag = true;
        		}
        		if (flag) {
        			ListNode temp = p.next;
        			p.next = res;
        			res = p;
        			p = temp;
        			if (count == n || p == null) {
        				ListNode end = start.next;
        				start.next = res;
        				end.next = p;
        				return head;
        			}
        			
        		} else {
        			p = p.next;
        		}
        }
        return head;
    }
}
