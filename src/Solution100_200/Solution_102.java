package Solution100_200;

public class Solution_102 {
	public boolean hasCycle(ListNode head) {  
		if (head == null) {
			return false;
		}
		ListNode fast = head;
		ListNode slow = head;
		while (true) {
			if  ((fast = fast.next) == null) return false;
			if (fast == slow) return true; 
			if  ((fast = fast.next) == null) return false;
			if (fast == slow) return true;
			slow = slow.next;
		}
    }
}
