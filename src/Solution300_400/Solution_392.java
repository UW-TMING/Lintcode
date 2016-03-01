package Solution300_400;

public class Solution_392 {
	public long houseRobber(int[] A) {
        long ans = 0;
        if (A == null || A.length == 0) return ans;
        int opt_2 = 0;
        int opt_1 = 0;
        for (int i = 0; i < A.length; i ++) {
        		int operator = Math.max(opt_1, A[i] + opt_2);
        		if (operator > ans) ans = operator;
        		opt_2 = opt_1;
        		opt_1 = operator;
        }
        return ans;
    }
}
