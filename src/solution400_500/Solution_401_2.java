package solution400_500;

public class Solution_401_2 {
	public static void main(String[] args) {
		int[][] matrix ;
		int[] m1 = {1, 5, 7};
		int[] m2 = {3, 7, 8};
		int[] m3 = {4, 8, 9};
		matrix = new int[][]{m1, m2, m3};
		int k = 4;
		System.out.println (new Solution_401_2().kthSmallest(matrix, k));
	}
	AdancedMinHeap amh = new AdancedMinHeap(1000);
	public int kthSmallest(int[][] matrix, int k) {
		if (matrix == null) {
			return 0;
		}
		if (k <= 0 || k > matrix.length * matrix[0].length) {
			return 0;
		}
		int count = 0;
		Node n = new Node(0, 0, matrix[0][0]);
		boolean visited[][] = new boolean[matrix.length][matrix[0].length];	
		amh.add(n);
		visited[0][0] = true;
		Node temp = null;
		while (count < k) {
			temp = amh.pop();
			int i = temp.i;
			int j = temp.j;
			addToHeap(i + 1, j, matrix, visited);
			addToHeap(i, j + 1, matrix, visited);
			count ++;
		}
		return temp.val;
	}
	public void addToHeap(int i, int j, int[][] matrix, boolean[][] visited) {
		if (i < matrix.length && j < matrix[0].length && !visited[i][j]) {
			amh.add(new Node(i, j, matrix[i][j]));
			visited[i][j] = true;
		}
	}
}
