package Solution0_100;

public class Solution_41 {
	public static void main (String[] args) {
		Solution_41 test = new Solution_41();
		int[] nums = {-1, 0, 1};
		System.out.println (test.maxSubArray(nums));
	}
	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0) {
    			return 0;
		}
	    int max = nums[0];
	    for (int i = 1; i < nums.length; i ++) {
	    		if (nums[i - 1] > 0) {
	    			nums[i] += nums[i - 1];
	    			if (nums[i] > max) {
	    				max = nums[i];
	    			}
	    		}
	    }
	    return max;
    }
}
