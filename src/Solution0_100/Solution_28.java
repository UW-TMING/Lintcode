package Solution0_100;

public class Solution_28 {
	public static void main (String []args) {
		System.out.println (24 % 18);
//		String str = "skdlslfd";
//		char[] s = str.toCharArray();
//		System.out.println (str.length());
	}
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		int x = rows - 1;
		int y = 0;
		while (x >= 0 && y < cols) {
			if (matrix[x][y] < target) {
				y ++;
			} else if (matrix[x][y] > target) {
				x --;
			} else {
				return true;
			}
		}
		return false;
    }
}
