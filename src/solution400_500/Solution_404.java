package solution400_500;

import java.util.Arrays;

class SegmentTree {
	public int start;
	public int end;
	public int sum;
	public SegmentTree left;
	public SegmentTree right;
	public SegmentTree () {}
	public SegmentTree (int start, int end) {
		this.start = start;
		this.end = end;
		this.sum = sum;
		this.left = null;
		this.right = null;
	}
}

public class Solution_404 {
	public static void main (String[] args) {
		Solution_404 test = new Solution_404 ();
		int[] A = {1,3,4,5,6,7,1,2,3,4,5};
		int start = 1;
		int end = 19;
		System.out.println (test.subarraySumII(A, start, end));
	}
	public int subarraySumII(int[] A, int start, int end) {
		if (A == null) {
			return 0;
		}
		int ans = 0;
		int[] presum = new int[A.length + 1];
		for (int i = 1; i < presum.length; i ++) {
			presum[i] = presum[i - 1] + A[i - 1]; 
		}
		Arrays.sort(presum);
		for (int i = 1; i < presum.length; i ++) {
			int left = presum[i] - end;
			int right = presum[i] - start;
			int left_index = getFirstBiger (presum, left);
			int right_index = getFirstBiger (presum, right);
System.out.println (i + "------->" + "left : " +left + " right : " + right + "---->" + left_index + " " + right_index);
			if (left_index != right_index) {
				ans += right_index - left_index + 1;
			}
		}
		return ans;
    }
	public int getFirstBiger (int[] presum, int val) {
		if (val < presum[0]) {
			return 0;
		}
		if (val > presum[presum.length - 1]) {
			return presum.length;
		}
		int start = 0;
		int end = presum.length - 1;
		while (start + 1 < end) {
			int mid = (start + end) / 2;
			if (presum[mid] <= val) {
				start = mid;
			} else {
				end = mid;
			}
		}
		return end;
	}
}