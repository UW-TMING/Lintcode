package Solution0_100;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_4_2 {
	public static void main (String[] args) {
		Solution_4_2 test = new Solution_4_2();
		System.out.println (test.nthUglyNumber(11));
	}
	class Node implements Comparator{
		long val;
		int flag;
		public Node() {}
		public Node(long val, int flag) {
			this.val = val;
			this.flag = flag;
		}
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return (int)(((Node)o1).val - ((Node)o2).val);
		}
	}
	public Node ncomparator = new Node();
	public PriorityQueue<Node> pq = new PriorityQueue<Node> (ncomparator);
	public int nthUglyNumber(int n) {
        if (n <= 1) return 1;
        int count = 1;
        Node n2 = new Node(2, 2);
        Node n3 = new Node(3, 3);
        Node n5 = new Node(5, 5);
        pq.add(n2); pq.add(n3); pq.add(n5);
        while (count + 1 < n) {
        		Node temp = pq.poll();
        		long val = temp.val;
        		if (temp.flag == 2) {
        			pq.add(new Node(val * 2, 2));
        			pq.add(new Node(val * 3, 3));
        			pq.add(new Node(val * 5, 5));
        		} else if (temp.flag == 3) {
        			pq.add(new Node(val * 3, 3));
        			pq.add(new Node(val * 5, 5));
        		} else {
        			pq.add(new Node(val * 5, 5));
        		}
        		count ++;
        }
        return (int)pq.peek().val;
    }
}
