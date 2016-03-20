package Solution300_400;

public class Solution_395 {
	public int[] visit;
	public int[] dp;
	public boolean firstWillWin(int[] values) {
		if (values == null || values.length <= 2) return true;
        int sum = 0;
        for (int k : values) {
        		sum += k;
        }
        int len = values.length;
        visit = new int[len + 1];
        dp = new int[len + 1];
        for (int i = 0; i <= len; i ++) { 
        		dp[i] = search(i, values, len);
        }
        return dp[len] > sum / 2 ? true : false;
	}
	
	public int search(int i, int[] values, int len) {
		if (visit[i] == 1) return dp[i];
		visit[i] = 1;
		if (i == 0) {
			return 0;
		} else if (i == 1) {
			return values[len - 1];
		} else if (i == 2) {
			return values[len - 2] + values[len - 1];
		} else if (i == 3) {
			return values[len - 2] + values[len - 3];
		} else {
			dp[i] = Math.max(Math.min(search(i - 2, values, len), search(i - 3, values, len)) + values[len - i],  Math.min(search(i - 4, values, len), search(i - 3, values, len)) + values[len - i] + values[len - i + 1]);
		}
		return dp[i];
	}
	
	public boolean firstWillWin1(int[] values) {
        if (values == null || values.length <= 2) return true;
        int sum = 0;
        for (int k : values) {
        		sum += k;
        }
        boolean ans = true;
        int[] dp = new int[values.length + 1];
        int len = values.length;
        dp[0] = 0;
        dp[1] = values[len - 1];
        dp[2] = values[len - 2] + values[len - 1];
        dp[3] = values[len - 2] + values[len - 3];
        for (int i = 4; i <= len; i ++) { 
        		dp[i] = Math.max(Math.min(dp[i - 2], dp[i - 3]) + values[len - i],  Math.min(dp[i - 4], dp[i - 3]) + values[len - i] + values[len - i + 1]);
        }
        return dp[len] > sum / 2 ? true : false;
    }
}
