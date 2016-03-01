package Solution0_100;

public class Solution_191 {
	public int maxProduct(int[] nums) {
		if (nums == null || nums.length == 0) return 0; 
        int max = nums[0];
        int temp_max = nums[0];
        int min = nums[0];
        int temp_min = nums[0];
        for (int i = 1; i < nums.length; i ++) {
        		temp_max = Math.max(nums[i], Math.max(nums[i] * temp_max, nums[i] * temp_min));
        		temp_min = Math.min(nums[i], Math.max(nums[i] * temp_max, nums[i] * temp_min));
        		if (temp_max > max) max = temp_max;
        		if (temp_max > max) max = temp_min;
        }
        return max;
    }
}
