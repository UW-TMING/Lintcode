package solution400_500;

public class Solution_450 {
	
	public static void main (String[] args) {
		ListNode p1 = new ListNode(10);
		ListNode p2 = new ListNode(20);
		ListNode p3 = new ListNode(30);
		ListNode p4 = new ListNode(40);
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		p4 = null;
		ListNode p = p1;
		while (p != null) {
			System.out.println (p.val);
			p = p.next;
		}
	}
	
	public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        ListNode newhead = new ListNode(0);
        ListNode lastNode = newhead;
        ListNode p = head;
        int count = 0;
        while (head != null) {
        		count ++;
        		if (count == k) {
        			ListNode temp = head.next;
        			head.next = null;
        			lastNode.next = reverse (p);
        			while (lastNode.next != null) {
        				lastNode = lastNode.next;
        			}
        			head = temp;
        			p = head;
        			count = 0;
        		} else {
        			head = head.next;
        		}
        }
        return newhead.next;
    }
	public ListNode reverse (ListNode head) {
		ListNode ans = null;
		ListNode p = head;
		while (p != null) {
		    ListNode temp = p.next;
		    p.next = ans;
		    ans = p;
			p = temp;
		}
		return ans;
	}
}
