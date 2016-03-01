package Solution100_200;

public class Solution_173 {
	public ListNode insertionSortList(ListNode head) {
        if (head == null) return head;
        ListNode lastNode = new ListNode(Integer.MIN_VALUE);
        ListNode p = head;
        while (p != null) {
        		ListNode p1 = lastNode;
        		while (p1.next != null && p1.next.val < p.val) {
        			p1 = p1.next;
        		}
        		ListNode temp = p.next;
        		p.next = p1.next;
        		p1.next = p;
        		p = temp;
        }
        return lastNode.next;
    }
}
