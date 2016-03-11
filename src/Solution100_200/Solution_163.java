package Solution100_200;

public class Solution_163 {
	public int numTrees(int n) { //dynamic programming
		if (n <= 0) return 1;
        int[] ans = new int[n + 1];
        ans[0] = 1;
        ans[1] = 1;
        for (int i = 2; i <= n; i ++) {
        		for (int j = 0; j < i; j ++) {
        			ans[i] += ans[j] * ans[i - j - 1];
        		}
        }
        return ans[n];
    }
}
