package solution400_500;

public class Solution_476 {
	public static void main (String[] args) {
		Solution_476 test = new Solution_476 ();
		int[] A = {3, 4, 3};
		System.out.println (test.stoneGame(A));
	}
	public int[][] dp;
	public int[][] visit;
	public int[][] sum;
	public int ans = 0;
	public int stoneGame(int[] A) {
        if (A == null || A.length == 0) return 0;
        int len = A.length;
        dp = new int[len][len];
        visit = new int[len][len];
        sum = new int[len][len];
        for (int i = 0; i < A.length; i ++) {
        		int tempSum = 0;
        		for (int j = i; j < A.length; j ++) {
        			tempSum += A[j];
        			sum[i][j] = tempSum;
        		}
        }
        for (int i = 0; i < A.length; i ++) {
    			dp[i][i] = 0;
    		}
        return search(0, len - 1, A);
    }
	public int search (int i, int j, int[] A) {
		if (i > j || i >= A.length || j >= A.length) return 0;
		if (visit[i][j] == 1) return dp[i][j];
		if (i == j) return 0;
		int distance = j - i - 1;
		int min = Integer.MAX_VALUE;
		for (int k = 0; k <= distance; k++) {
			int temp = search(i, i + k, A) + search(i + k + 1, j, A);
			if (temp < min) {
				min = temp;
			}
		}
		visit[i][j] = 1;
		dp[i][j] = min + sum[i][j];
		return dp[i][j];
	}
}
