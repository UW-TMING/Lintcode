package Solution100_200;

public class Solution_103 {
	public ListNode detectCycle(ListNode head) {  
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
        		if (fast == null || fast.next == null) return null;
        		fast = fast.next.next;
        		slow = slow.next;
        		if (slow == fast) break; 
        }
        fast = head;
        while (fast != slow) {
        		fast = fast.next;
        		slow = slow.next;
        }
        return slow;
    }
}
