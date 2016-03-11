package solution400_500;

public class Solution_436 {
	public int maxSquare(int[][] matrix) {
		if (matrix == null || matrix.length == 0) return 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int ans = 0;
        int[][] res = new int[2][cols + 1];
        for (int i = 1; i < rows + 1; i ++) {
        		for (int j = 1; j < cols + 1; j ++) {
        			if (matrix[i - 1][j - 1] == 0) res[i % 2][j] = 0;
        			else {
        				int min = Math.min(res[(i - 1) % 2][j - 1], res[i % 2][j - 1]);
        				int minest = Math.min(min, res[(i - 1) % 2][j]);
        				res[i % 2][j] = minest + 1;
        				if (res[i % 2][j] > ans) ans = res[i % 2][j];
        			}
        		}
        }
        return ans * ans;
    }
}
