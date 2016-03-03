package Solution0_100;

import java.util.List;

public class Solution_104 {
	public ListNode mergeKLists(List<ListNode> lists) {  
        return merge(lists, 0, lists.size() - 1);
    }
	public ListNode merge (List<ListNode> lists, int left, int right) {
		if (left < 0 || right > lists.size() || left > right) return null;
		if (left == right) return lists.get(left);
		int mid = (left + right) / 2;
		ListNode leftNode = merge (lists, left, mid);
		ListNode rightNode = merge (lists, mid + 1, right);
		ListNode p1 = leftNode;
		ListNode p2 = rightNode;
		ListNode newhead = new ListNode(0);
		ListNode p = newhead;
		while (p1 != null || p2 != null) {
			if (p1.val < p2.val) {
				p.next = p1;
				p1 = p1.next;
			} else {
				p.next = p2;
				p2 = p2.next;
			}
			p = p.next;
		}
		if (p1 != null) p.next = p1;
		if (p2 != null) p.next = p2;
		ListNode temp = newhead.next;
		newhead = null;
		return temp;
	}
}
