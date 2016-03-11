package Solution300_400;

public class Solution_398 {
	int[][] flag;
	int[][] dfs;
	int rows;
	int cols;
	public int longestIncreasingContinuousSubsequenceII(int[][] A) {
		if (A == null || A.length == 0) return 0;
		int ans = 1;
		rows = A.length;
		cols = A[0].length;
		flag = new int[rows][cols];
		dfs = new int[rows][cols];
		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < cols; j ++) {
				ans = Math.max(ans, search (i, j, A) + 1);
			}
		}
		return ans;
	}
	
	int[] dx = {1, -1, 0, 0};
	int[] dy = {0,  0, 1, -1};
	
	public int search (int i, int j, int[][] A) {
		if (flag[i][j] == 1) return dfs[i][j];
		int ans = 1;
		for (int k = 0; k < dx.length; k ++) {
			int x = i + dx[k];
			int y = j + dy[k];
			if (x >= 0 && x < rows && y >= 0 && y < cols && A[x][y] < A[i][j]) {
				ans = Math.max(ans, search (x, y, A) + 1);
			}
		}
		dfs[i][j] = ans;
		flag[i][j] = 1;
		return dfs[i][j];
	}
}
