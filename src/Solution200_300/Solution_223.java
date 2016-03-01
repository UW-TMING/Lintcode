package Solution200_300;

public class Solution_223 {
	public static void main (String[] args) {
		
	}
	public boolean isPalindrome(ListNode head) {
		if (head == null) return true;
		ListNode p = head;
		ListNode middle = findMiddle (head);
		ListNode res = reverse (middle.next);
		while (p != null && res != null) {
			if (p.val != res.val) {
				return false;
			}
			p = p.next;
			res = res.next;
		}
        return true;
    }
	public ListNode findMiddle (ListNode head) {
		ListNode slow = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public ListNode reverse (ListNode head) {
		if (head == null) return head;
		ListNode p = head;
		ListNode res = null;
		while (p != null) {
			ListNode temp = p.next;
			p.next = res;
			res = p;
			p = temp;
		}
		return res;
	}
}
