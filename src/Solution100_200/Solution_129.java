package Solution100_200;

public class Solution_129 {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	public ListNode[] rehashing(ListNode[] hashTable) {
		if (hashTable == null) return null;
		ListNode[] newHashTable = new ListNode[hashTable.length * 2];
		for (int i = 0; i < hashTable.length; i ++) {
			ListNode head = hashTable[i];
			while ( head != null) {
				insert(newHashTable, head);
				head = head.next;
			}
		}
        return newHashTable;
    }
	public void insert (ListNode[] hashTable, ListNode k) {
		int hashcode = hashcode(k.val, hashTable.length);
		ListNode head = hashTable[hashcode];
		if (head != null) { 
			k.next = head.next;
			head.next = k;
		} else {
			hashTable[hashcode] = k;
		}
	}
	public int hashcode (int key, int capacity) {
		return (key % capacity + capacity) % capacity;
	}
}
