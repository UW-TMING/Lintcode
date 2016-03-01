package Solution0_100;

public class Solution_76 {
	public static void main (String[] args) {
		Solution_76 test = new Solution_76();
		int[] nums = {9, 3, 6, 2, 7};
		System.out.println (test.longestIncreasingSubsequence(nums));
	}
	public void getOpt (int[] nums, int[]opt, int index) {
		int max = 0;
		for (int i = 0; i < index; i ++) {
			if (nums[i] <= nums[index] && opt[i] > max) {
				max = opt[i];
			}
		}
		opt[index] = max + 1;
	}
	public int longestIncreasingSubsequence(int[] nums) {
        int ans = 0;
        if (nums == null || nums.length == 0) return ans;
        int[] opt = new int[nums.length];
        opt[0] = 1; 
        ans = 1;
        for (int i = 1; i < nums.length; i ++) {
        		getOpt (nums, opt, i);
        		if (opt[i] > ans) {
        			ans = opt[i];
        		}
        }
        return ans;
    }
}
