package solution400_500;

public class Solution_401 {
	public static void main (String []args) {
		int[] m1 = {1, 5, 7};
		int[] m2 = {3, 7, 8};
		int[] m3 = {4, 8, 9};
//		int[] m4 = {100};
//		int[] m5 = {101};
//		int[] m6 = {1000};
//		int[] m7 = {9999};
		int[][] matrix = {m1, m2, m3};
		int k = 4;
		System.out.println (new Solution_401().kthSmallest(matrix, k));
	}
	public int kthSmallest(int[][] matrix, int k) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		if (k > rows * cols) {
			return -1;
		}
		int i = 0;
		int j = 0;
		int temp_k = k;
		int count = (rows - i) + (cols - j) - 1;
		int temp = count;
		while (count < k) {
			temp_k = temp_k - temp;
			i += 1;
			j += 1;
			if (i == rows - 1 || j == cols - 1) {
				break;
			}
			temp = (rows - i) + (cols - j) - 1;
			count += temp;
		}
		MinHeap minHeap = new MinHeap(10000);
		for (int m = i; m < rows; m ++) {
			minHeap.add(matrix[m][j]);
		}
		for (int m = j + 1; m < cols; m ++) {
			minHeap.add(matrix[i][m]);
		}
		for (int m = 0; m < temp_k - 1; m ++) {
			minHeap.pop();
		}
        return minHeap.pop();
    }
}
