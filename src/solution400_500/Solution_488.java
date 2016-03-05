package solution400_500;

import java.util.HashSet;

public class Solution_488 {
	public static void main(String[] args) {
		Solution_488 test = new Solution_488();
		System.out.println (test.isHappy(19));
	}
	public boolean isHappy(int n) {
        if (n <= 0) return false;
        HashSet<Integer> hashSet = new HashSet<Integer> ();
        int sum = 0;
        hashSet.add(n);
        while (n != 0) {
        		sum = 0;
        		while (n != 0) {
        			int k = n % 10;
        			int t = n / 10;
        			sum += k * k;
        			n = t;
        		}
        		n = sum;
        		if (n == 1) return true;
        		else if (hashSet.contains(n)) {
        			return false;
        		} else {
        			hashSet.add(n);
        		}
        }
        return false;
    }
}
