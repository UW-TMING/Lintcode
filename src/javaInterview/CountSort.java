package javaInterview;

public class CountSort {
	public static void main (String[] args) {
		int[] nums={3, 2, 2, 1, 4};
		int[] ans = new CountSort().countSort(nums);
		for (int k : ans) {
			System.out.print (k + " ");
		}
		System.out.println();
	}
	public int[] countSort (int[] nums) {
		if (nums == null || nums.length == 0) return nums;
		int min = nums[0];
		int max = nums[0];
		for (int i : nums) {
			if (i < min) min = i;
			if (i > max) max = i;
		}
		int[] b = new int[nums.length];
		int diff = max - min + 1;
		int[] c = new int[diff];
		for (int i : nums) c[i - min] += 1;
		for (int i = 1; i < c.length; i ++) {
			c[i] += c[i - 1];
		}
		for (int i = 0; i < nums.length; i ++) {
			b[--c[nums[i] - min]] = nums[i];
		}
		return b;
	}
}
