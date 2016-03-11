package Solution100_200;

public class Solution_114 {
	public static void main (String[] args) {
		Solution_114 test = new Solution_114();
		int m = 3;
		int n = 7;
		System.out.println (test.uniquePaths(m, n));
	}
	public int uniquePaths(int m, int n) {
		if (m == 0 && n == 0) return 0; 
		if (m <= 0 || n <= 0) return 1;
		int[][] count = new int[m][n];
		for (int i = 0; i < m; i ++) {
			count[i][0] = 1;
		}
		for (int i = 0; i < n; i ++) {
			count[0][i] = 1;
		}
		for (int i = 1; i < m; i ++) {
			for (int j = 1; j < n; j ++) {
				count[i][j] = count[i - 1][j] + count[i][j - 1];
			}
		}
		return count[m - 1][n - 1];
    }
}
