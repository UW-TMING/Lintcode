package Solution300_400;

public class Solution_397 {
	public int longestIncreasingContinuousSubsequence(int[] A) {
        if (A == null) return -1;
        int ans = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < A.length; i ++) {
        		if (A[i] >= A[i - 1]) {
        			ans ++;
        			if (ans > max) max = ans;
        		} else {
        			ans = 1;
        		}
        }
        for (int i = 1; i < A.length; i ++) {
	    		if (A[i] <= A[i - 1]) {
	    			ans ++;
	    			if (ans > max) max = ans;
	    		} else {
	    			ans = 1;
	    		}
        }
        return max;
    }
}
