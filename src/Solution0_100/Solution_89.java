package Solution0_100;

public class Solution_89 {
	public int kSum(int A[], int k, int target) {
		if (A == null || A.length == 0) return 0; 
		int len = A.length;
		int[][][] dp = new int[len + 1][k + 1][target + 1];
		for (int i = 0; i <= len; i ++) {
			dp[i][0][0] = 1;
		}
		for (int i = 1; i <= len; i ++) {
			for (int j = 1; j <= k; j ++) {
				for (int t = 1; t <= target; t ++) {
					dp[i][j][t] = 0;
					if (t >= A[i - 1]) {
						dp[i][j][t] = dp[i - 1][j - 1][t - A[i - 1]] + dp[i - 1][j][t];
					} else {
						dp[i][j][t] = dp[i - 1][j][t];
					}
				}
			}
		}
        return dp[len][k][target];
    }
}
