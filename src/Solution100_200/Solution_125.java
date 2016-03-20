package Solution100_200;

public class Solution_125 {
	public int backPackII(int m, int[] A, int V[]) {
        if (A == null || V == null) return 0;
        int[][] helper = new int[2][m + 1];
        for (int i = A.length - 1; i >= 0; i --) {
        		for (int j = 0; j <= m; j ++) {
        			if (j >= A[i]) {
        				helper[i % 2][j] = Math.max(helper[(i + 1) % 2][j], helper[(i + 1) % 2][j - A[i]] + V[i]);
        			} else {
        				helper[i % 2][j] = helper[(i + 1) % 2][j];
        			}
        		}
        }
        return helper[0][m];
    }
}
