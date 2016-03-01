package Solution0_100;

public class Solution_31 {
	public int partitionArray(int[] nums, int k) {
	    if (nums == null || nums.length == 0) {
	    		return 0;
	    }
	    int i = 0;
	    int j = nums.length - 1;
	    int temp = nums[i];
	    while (i < j) {
	    		while (i < j && nums[j] >= k) {
	    			j --;
	    		}
	    		nums[i ++] = nums[j];
	    		while (i < j && nums[i] < k) {
	    			i ++;
	    		}
	    		nums[j --] = nums[i];
	    }
	    nums[i] = temp;
	    if (i == nums.length - 1) {
	    		return nums.length;
	    }
	    return i;
    }
}
