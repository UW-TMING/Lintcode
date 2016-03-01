package Solution300_400;

import solution400_500.ListNode;

public class Solution_380 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null; 
        ListNode endA = headA;
        while (endA.next != null) endA = endA.next; 
        endA.next = headA;
        ListNode slow = headB;
        ListNode fast = headB;
        while (true) {
        		if (fast == null || fast.next == null) return null;
        		fast = fast.next.next;
        		slow = slow.next;
        		if (fast == slow) {
        			break;
        		}
        }
        fast = headB;
        while (slow != fast) {
        		slow = slow.next;
        		fast = fast.next;
        }
        endA.next = null;
        return slow;
    }
}
