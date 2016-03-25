package Solution100_200;

public class Solution_118_2 {
	public int numDistinct(String S, String T) {
		if (S == null || T == null || S.length() == 0 || T.length() == 0) return 1;
		int[][] dp = new int[T.length() + 1][S.length() + 1];
		for (int i = 0; i < S.length() + 1; i ++) {
			dp[0][i] = 1;
 		}
		for (int i = 1; i <= T.length(); i ++) {
			for (int j = 1; j <= S.length(); j ++) {
				char t = T.charAt(i);
				char s = S.charAt(j);
				if (t == s) {
					dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
				} else {
					dp[i][j] = dp[i][j - 1];
				}
			}
		}
		return dp[T.length()][S.length()];
	}
}
