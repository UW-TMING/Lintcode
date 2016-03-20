package Solution0_100;

public class Solution_92 {
	public static void main (String[] args) {
		Solution_92 test = new Solution_92 ();
		int[] A = {3, 4, 8, 5};
		int m = 10;
		System.out.println (test.backPack(m, A));
	}
	public int backPack(int m, int[] A) {
        if (A == null || A.length == 0) return 0;
        int len = A.length;
        int[][] helper = new int[2][m + 1];
        for (int i = len - 1; i >= 0; i --) {
        		for (int j = 0; j <= m; j ++) {
        			if (j >= A[i]) {
        				helper[i % 2][j] = Math.max(helper[(i + 1) % 2][j], helper[(i + 1) % 2][j - A[i]] + A[i]);
        			} else {
        				helper[i % 2][j] = helper[(i + 1) % 2][j];
        			}
        		}
        }
        return helper[0][m];
    }
}
