package Solution0_100;

public class Solution_38 {
	public static void main (String[] args) {
		int[] m1 = {1, 3, 5, 7};
		int[] m2 = {3, 11, 16, 20};
		int[] m3 = {23, 30, 34, 50};
		int[][] matrix = {m1, m2, m3};
		int target = 3;
		System.out.println (new Solution_38().searchMatrix(matrix, target));
	}
	public int searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0) {
			return 0;
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		int x = rows - 1;
		int y = 0;
		int count = 0;
		while (x >= 0 && y < cols) {
System.out.println (matrix[x][y] + "  " + target);
			if (matrix[x][y] < target) {
				y ++;
			} else if (matrix[x][y] > target) {
				x --;
			} else {
				x --;
				y ++;
				count ++;
			}
		}
		return count;
	}
	/*public int searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int real_rows = 0;
        int real_cols = 0;
        for (; real_rows < rows; real_rows ++) {
        		if (matrix[real_rows][0] > target) {
        			break;
        		}
        }
        for (; real_cols < cols; real_cols ++) {
	    		if (matrix[0][real_cols] > target) {
	    			break;
	    		}
        }
        int count = 0;
        for (int i = 0; i < real_rows; i ++) {
        		for (int j = 0; j < real_cols; j ++) {
        			if (matrix[i][j] == target) {
        				count++;
        			}
        		}
        }
        return count;
    }*/
}
