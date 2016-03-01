package solution400_500;

import java.util.HashMap;
import java.util.Map;

public class Solution_405 {
	public static void main (String[] args) {
		int[] m1 = {2, -2};
		int[] m2 = {-4, 4};
		Solution_405 test = new Solution_405();
		int[][] matrix = {m1, m2};
		int[][] ans = test.submatrixSum(matrix);
		for (int i = 0; i < ans.length; i ++) {
			for (int j = 0; j < ans[0].length; j ++) {
				System.out.print (ans[i][j] + " ");
			}
			System.out.println();
		}
	}
	public int[][] submatrixSum(int[][] matrix) {
        if (matrix == null) {
        		return null;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] sum = new int[rows + 1][cols + 1];
        for (int i = 0; i <= rows; i ++) sum[i][0] = 0;
        for (int i = 0; i <= cols; i ++) sum[0][i] = 0;
        int[][] ans = new int[2][2];
        for (int i = 0; i < rows; i ++) {
        		for (int j = 0; j < cols; j ++) {
        			sum[i + 1][j + 1] = matrix[i][j] + sum[i + 1][j] + sum[i][j + 1] - sum[i][j];
        		}
        }
        for (int i = 0; i < rows; i ++) {
        		for (int j = i + 1; j <= rows; j ++) {
        			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer> ();
        			for (int k = 1; k <= cols; k ++) {
        				int temp = sum[j][k] - sum[i][k];
        				if (hm.containsKey(temp)) {
        					int tempColumn = hm.get(temp);
        					ans[0][0] =  i; ans[0][1] = tempColumn;
        					ans[1][0] = j - 1; ans[1][1] = k - 1;
        					return ans;
        				} else {
        					hm.put(temp, k);
        				}
        			}
        		}
        }
        return ans;
    }
}
