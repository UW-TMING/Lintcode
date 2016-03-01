package solution400_500;

public class Solution_465 {
	public static void main (String[] args) {
		int[] A = new int[]{1, 7, 11};
		int[] B = new int[]{2, 4, 6};
		int k = 3;
		System.out.println (new Solution_465().kthSmallestSum(A, B, k));
	}
	AdancedMinHeap amh = new AdancedMinHeap(1000000);
	public int kthSmallestSum(int[] A, int[] B, int k) {
        if (A == null && B == null) {
        		return -1;
        }
        if (A == null && k <= B.length) {
        		return B[k - 1];
        }
        if (B == null && k <= A.length) {
        		return A[k - 1];
        }
        if (k <= 0 || k > A.length * B.length) {
        		return -1;
        }
        boolean visited[][] = new boolean[A.length][B.length];
        amh.add(new Node(0, 0, A[0] + B[0]));
        int count = 0;
        Node temp = null;
        while (count < k) {
        	temp = amh.pop();
			int i = temp.i;
			int j = temp.j;
			addToHeap(i + 1, j, A, B, visited);
			addToHeap(i, j + 1, A, B, visited);
			count ++;
        }
        return temp.val;
    }
	public void addToHeap(int i, int j, int[] A, int[] B, boolean[][] visited) {
		if (i < A.length && j < B.length && !visited[i][j]) {
			amh.add(new Node(i, j, A[i] + B[j]));
			visited[i][j] = true;
		}
	}
}
