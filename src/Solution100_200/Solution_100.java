package Solution100_200;

public class Solution_100 {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int count = 1;
		int val = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != val) {
				val = nums[i];
				nums[count ++] = val; 
			}
		}
        return count;
    }
}
