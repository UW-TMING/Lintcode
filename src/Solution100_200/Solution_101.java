package Solution100_200;

public class Solution_101 {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int count = 1;
		int val = nums[0];
		int ans = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == val && count < 2) {
				nums[ans ++] = val;
				count ++;
			}
			if (nums[i] != val ) {
				val = nums[i];
				nums[ans ++] = val; 
				count = 1;
			}
		}
        return ans;
    }
}
