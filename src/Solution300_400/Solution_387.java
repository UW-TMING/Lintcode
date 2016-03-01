package Solution300_400;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution_387 {
	public static void main(String[] args) {
		int[] A = {3, 6, 7, 4};
		int[] B = {2, 8, 9, 3};
		System.out.println (new Solution_387().smallestDifference(A, B));
	}
	public int smallestDifference(int[] A, int[] B) {
		Arrays.sort(A);
		Arrays.sort(B);
		int i = 0;
		int j = 0;
		int min = Integer.MAX_VALUE;
		while(true) {
			int temp = Math.abs(A[i] - B[j]);
			if (A[i] > B[j]) {
				j ++;
			} else {
				i ++;
			}
			if (temp < min) {
				min = temp;
			}
			if (i == A.length || j == B.length) {
				break;
			}
		}
		if (i == A.length) {
			for (int k = j; k < B.length; k ++) {
				int temp = Math.abs(A[i - 1] - B[k]);
				if (temp < min) {
					min = temp;
				}
			}
		}
		if (j == B.length) {
			for (int k = i; k < A.length; k ++) {
				int temp = Math.abs(A[k] - B[j - 1]);
				if (temp < min) {
					min = temp;
				}
			}
		}
		return min;
    }
}
