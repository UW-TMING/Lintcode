package Solution100_200;

public class Solution_189 {
	public static void main (String[] args) {
		Solution_189 test = new Solution_189 ();
		int[] A = {0, 0};
		System.out.println (test.firstMissingPositive(A));
	}
	public int firstMissingPositive(int[] A) {
		if (A == null || A.length == 0) return 1;
		for (int i = 0; i < A.length; i ++) {
			while (i < A.length && A[i] != i + 1) {
				if (A[i] <= 0 || A[i] > A.length) break;
				if (A[i] == A[A[i] - 1]) {
					A[i] = -1; 
					break; 
				}
				int t = A[i];
				A[i] = A[t - 1];
				A[t - 1] = t;
			}
		}
		for (int i = 0; i < A.length; i ++) {
			if (A[i] != i + 1) return i + 1;
		}
        return A.length + 1;
    }
}
