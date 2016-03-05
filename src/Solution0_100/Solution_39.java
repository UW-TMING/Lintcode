package Solution0_100;

import java.util.ArrayList;

public class Solution_39 {
	public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        if (nums == null) return;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.size(); i ++) {
        		int val = nums.get(i);
        		if (max >= val) {
        			val = max;
        			index = i;
        		}
        }
        if (index == nums.size() - 1 || index == -1) return;
        int i = 0;
        int j = index;
        swapInterval (nums, i, j);
        i = index + 1;
        j = nums.size() - 1;
        swapInterval (nums, i, j);
        i = 0;
        swapInterval (nums, i, j);
    }
	public void swapInterval (ArrayList<Integer> nums, int i, int j) {
		while (i < j) {
			swap(nums, i ++, j --);
		}
	}
	
	public void swap (ArrayList<Integer> nums, int i, int j) {
		if (nums == null || i < 0 || j > nums.size() -1) return;
		int temp = nums.get(i);
		nums.set(i, nums.get(j));
		nums.set(j, temp);
	}
}
