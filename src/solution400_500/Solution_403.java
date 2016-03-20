package solution400_500;

import java.util.ArrayList;

public class Solution_403 {
	public ArrayList<Integer> continuousSubarraySumII(int[] A) {
        if (A == null || A.length == 0) return null;
        ArrayList<Integer> ans = new ArrayList<Integer> ();
        int start = 0;
        int len = A.length;
        int sum = A[0];
        int max = sum;
        ans.add(0);
        ans.add(0);
        for (int i = 0; i < 2 * len - 1; i ++) {
        		if (sum > max) {
        			ans.set(0, start % len);
        			ans.set(1, (i - 1 ) % len);
        			max = sum;
        		}
        		if (sum < 0) {
        			start = i;
        			sum = 0;
        		}
        		sum += A[i % len];
        }
        if (sum > max) {
			ans.set(0, start % len);
			ans.set(1, (2 * len - 1 ) % len);
		}
        return ans;
    }
}
