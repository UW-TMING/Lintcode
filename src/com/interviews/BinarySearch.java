package com.interviews;

public class BinarySearch {
	public static void main (String[] args) {
		int[] A = {1, 4, 6, 7, 7, 10, 11, 11, 12};
		System.out.println (search(A, 0, A.length - 1, 4));
	}
	public static int search(int[] A, int start, int end, int val) {
		int left = start;
		int right = end;
		while (left + 1 < right) {
			int mid = (left + right) / 2;
			if (A[mid] < val) {
				left = mid;
			} else {
				right = mid;
			}
		}
		if (val <= A[left]) return left;
		else if (val > A[right]) {
			return right + 1;
		} else {
			return right;
		}
	}
}
