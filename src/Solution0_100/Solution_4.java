package Solution0_100;

import java.util.LinkedList;

public class Solution_4 {
	
	public static void main(String[] args) {
		int temp = Integer.MAX_VALUE;
		System.out.println (nthUglyNumber(1665));
	}
	
	public static int nthUglyNumber(int n) {
		if (n <= 1) return 1;
        LinkedList<Long> l2 = new LinkedList<Long>();
        LinkedList<Long> l3 = new LinkedList<Long>();
        LinkedList<Long> l5 = new LinkedList<Long>();
        int count = 1;
        long next = 1;
        l2.add((long) 2);
        l3.add((long) 3);
        l5.add((long) 5);
        while (count < n) {
        		long temp2 = l2.peek();
        		long temp3 = l3.peek();
        		long temp5 = l5.peek();
//System.out.println (temp2 + " " + temp3 + " " + temp5);
        		next = temp2 < temp3 ? temp2 : temp3;
        		next = next < temp5 ? next : temp5;
        		if (next == temp2) {
        			l2.poll();
        			l2.add(next * 2);
        			l3.add(next * 3);
        		} else if (next == temp3) {
        			l3.poll();
        			l3.add(next * 3);
        		} else {
        			l5.poll();
        		}
        		l5.add(next * 5);
        		count ++;
        }
        return (int)next;
    }
}
