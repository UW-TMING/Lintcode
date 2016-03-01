package Solution100_200;

class ListNode {
	int val;
	ListNode next;
	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Solution_174 {
	public int getCount (ListNode head) {
		ListNode l = head;
		int count = 0;
		while (l != null) {
			count ++;
			l = l.next;
		}
		return count;
	}
	ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 0) {
        		return head;
        }
        int sum = getCount (head);
        if (n > sum) {
        		return head;
        }
        int target = sum - n + 1;
        if (target == 1) {
        		return head.next;
        }
        ListNode ans = head;
        int count = 0;
        ListNode before = head;
        while (ans != null) {
            count++;
            if (count == target) {
                before.next = ans.next;
                break;
            }
            before = ans;
            ans = ans.next;
        }
        return head;
    }
}
