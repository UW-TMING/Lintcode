package Solution100_200;

public class Solution_166 {
	ListNode nthToLast(ListNode head, int n) {
		if (n <= 0) return null;
        ListNode p = head;
        int count = 0;
        while (p != null) {
        		count ++;
        		p = p.next;
        }
        p = head;
        if (count > n) return null; 
        int val = n - count + 1;
        count = 0;
        while (p != null) {
        		count ++;
        		if (count == val) return p;
        		p = p.next;
        }
        return null;
    }
}
