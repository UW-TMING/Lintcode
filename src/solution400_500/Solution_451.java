package solution400_500;

public class Solution_451 {
	public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ans = new ListNode (-1);
        ListNode lastNode = ans;
        ListNode p = head;
        while (p != null && p.next != null) {
        		ListNode temp = p.next.next;
        		lastNode.next = p.next;
        		p.next.next = p;
        		lastNode = p;
        		lastNode.next = temp;
        		p = temp;
        }
        return ans.next;
    }
}
