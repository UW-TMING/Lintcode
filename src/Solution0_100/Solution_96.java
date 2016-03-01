package Solution0_100;


public class Solution_96 {
	public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
        		return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode midEnd = head;
        while (slow.next != null) {
        		if (slow.next.val >= x && slow.val < x) {
        			fast =  slow;
        			midEnd = fast;
        			while (fast.next != null) {
        				if (fast.next.val >= x && fast.val < x) {
        					ListNode temp = slow.next;
        					slow.next = fast;
        					midEnd.next = fast.next;
        					fast.next = temp;
        					slow = fast;
        					break;
        				}
        				midEnd = fast;
        				fast = fast.next;
        			}
        		}
        		slow = slow.next;
        }
        return head;
    }
}
