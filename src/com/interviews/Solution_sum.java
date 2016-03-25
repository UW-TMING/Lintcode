package com.interviews;

import java.util.ArrayList;

public class Solution_sum {
	public static void main (String[] args) {
		int[] nums = {-3, 1, 2, -3, 4};
		ArrayList<Integer> res = subarraySum(nums);
		for (int k : res) {
			System.out.println (k);
		}
	}
	public static ArrayList<Integer> subarraySum(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        ArrayList<Integer> ans = new ArrayList<Integer> ();
        int sum = nums[0];
        int max = sum;
        int start = 0;
        ans.add(start);
        ans.add(start);
        for (int i = 1; i < nums.length; i ++) {
        		if (sum == max) {
        			ans.set(0, start);
        			ans.set(1, i - 1);
        			max = sum;
        		}
        		if (sum < 0) {
        			start = i;
        			sum = 0;
        		}
        		sum += nums[i];
        }
        if (sum > max) {
        	ans.set(0, start);
			ans.set(1, nums.length - 1);
        		max = sum;
        }
        return ans;
    }
}
