package solution400_500;

public class Solution_398 {
	public int longestIncreasingContinuousSubsequenceII(int[][] A) {
		int ans = 0;
		if (A == null || A.length == 0) return ans;
		int rows = A.length;
		int cols = A[0].length;
		int[][] res = new int[rows][cols];
		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < cols; j ++) {
				int val = A[i][j];
				int max = 0;
				if (compare(i - 1, j - 1, A, val) && res[(i - 1)][j - 1] > max)
					max = res[(i - 1)][j - 1];
				if (compare(i, j - 1, A, val) && res[i][j - 1] > max)
					max = res[i][j - 1];
				if (compare(i, j + 1, A, val) && res[i][j + 1] > max)
					max = res[i][j + 1];
				res[i][j] = max;
				if (max > ans) ans = max;
			}
		}
        return ans;
    }
	public boolean compare (int i, int j, int[][]A, int val) {
		if (i >= 0 && i < A.length && j >= 0 && j < A[0].length) {
			if (A[i][j] > val) return false;
			else return true;
		}
		return false;
	}
}
