package Solution300_400;

public class Solution_396 {
	public static void main(String[] args) {
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 13, 11, 10, 9};
		Solution_396 test = new Solution_396 ();
		System.out.println (test.firstWillWin(values));
	}
	public int[][] visit ;
	public int[][] dp;
	public boolean firstWillWin(int[] values) {
        if (values == null || values.length == 0) return true;
        int len = values.length;
        int sum = 0;
        for (int k : values) {
        		sum += k;
        }
        visit = new int[len][len];
        dp = new int[len][len];
        int val = search(0, len - 1, values, len);
System.out.println (val + "  " + sum);
        return val > sum / 2 ? true : false;
    }
	public int search (int i, int j, int[] values, int len) {
		if (i > j || i >= len || j >= len) return 0;
		if (visit[i][j] == 1) return dp[i][j];
		if (i == j && i < len) return values[i];
		int left = Math.min(search(i + 2, j, values, len),  search(i + 1, j - 1, values, len));
		int right = Math.min(search(i, j - 2, values, len),  search(i + 1, j - 1, values, len));
		dp[i][j] = Math.max(values[i] + left,  values[j] + right);
		visit[i][j] = 1;
		return dp[i][j];
	}
}
