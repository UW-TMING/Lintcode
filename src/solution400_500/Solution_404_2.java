package solution400_500;

import java.util.Arrays;

public class Solution_404_2 {
	public static void main (String[] args) {
		Solution_404_2 test = new Solution_404_2 ();
		int[] A = {1, 2, 3, 4};
		int start = 1;
		int end = 3;
		System.out.println (test.subarraySumII(A, start, end));
	}
	public int subarraySumII(int[] A, int start, int end) {
		if (A == null || A.length == 0 || start > end) return 0; 
		int res = 0;
		for (int i = 1; i < A.length; i ++) {
			A[i] = A[i - 1] + A[i];
		}
		Arrays.sort(A);
		for (int k : A) System.out.print(k + " "); 
		for (int i = 0; i < A.length; i ++) {
			if (A[i] >= start && A[i] <= end)
                res ++;
			int l = A[i] - end;
			int r = A[i] - start;
			int rightIndex = search(A, r + 1);
			int leftIndex = search(A, l);
			res += rightIndex - leftIndex;
		}
		return res;
	}
	public int search (int[] A, int val) {
		int left = 0;
		int right = A.length - 1;
		int ans = 0;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (A[mid] < val) {
				left = mid + 1;
			} else {
				ans = mid;
				right = mid - 1;
			}
		}
		return ans;
	}
}
