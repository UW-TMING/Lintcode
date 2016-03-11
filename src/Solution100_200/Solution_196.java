package Solution100_200;

public class Solution_196 {
	public int findMissing(int[] nums) {
		if (nums == null) return -1;
        for (int i = 0; i < nums.length; i ++) {
        		while (i < nums.length && i != nums[i]) {
        		    if (nums[i] >= nums.length) break;
        			int t = nums[i];
        			nums[i] = nums[t];
        			nums[t] = t;
        		}
        }
        for (int i = 0; i < nums.length; i ++) {
        		if (i != nums[i]) return i;
        }
        return nums.length;
    }
}
