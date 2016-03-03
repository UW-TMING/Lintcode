package Solution100_200;

public class Solution_106 {
	public static void main (String[] args) {
		ListNode t = new ListNode (1);
		t.next = null;
		Solution_106 test = new Solution_106();
		test.sortedListToBST(t);
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
	
	public TreeNode sortedListToBST(ListNode head) { 
		if (head == null) return null;
		ListNode mid = findMiddle (head);
		ListNode temp = mid.next;
		TreeNode root = new TreeNode(mid.val);
		ListNode p = head;
		if (mid == head) head = null;
		while (p.next != mid) {
			p = p.next;
		}
		p.next = null;
		mid = null;
		root.left = sortedListToBST (head);
		root.right = sortedListToBST (temp);
		return root;
    }
}
