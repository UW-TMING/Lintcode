package Solution0_100;

import java.util.Arrays;

public class Solution_82 {
	public int singleNumber(int[] A) {
		if (A == null) return 0;
		Arrays.sort(A);
		int count = 1;
		for (int i = 0; i < A.length - 1; i ++) {
			if (A[i] == A[i + 1]) {
				count ++;
			} else {
				if (count != 2) return A[i];
				else count = 1;
			}
		}
		return A[A.length - 1];
	}
}
