package Solution100_200;

public class Solution_170 {
	public ListNode rotateRight(ListNode head, int k) {
		if (k <= 0) return head;
        if (head == null) return head;
        ListNode p = head;
        int count = 0;
        while (p != null) {
        		count ++;
        		p = p.next;
        }
        int val = count - k % count;
        p = head;
        ListNode end = null;
        count = 0;
        while (p.next != null) {
        		count++;
        		if (count == val - 1) end = p;
        		p = p.next;
        }
        end.next = null;
        p.next = head;
        head = p;
        return head;
    }
}
