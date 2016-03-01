package Solution0_100;

public class Solution_35 {
	public ListNode reverse(ListNode head) {
        if (head == null) return head;
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
}
