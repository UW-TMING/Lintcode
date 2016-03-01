package solution400_500;

public class Solution_406 {
	public static void main (String []args) {
		int[] nums = {2,3,1,2,4,3};
		int s = 7;
		System.out.println (new Solution_406().minimumSize(nums, s));
	}
	public int minimumSize(int[] nums, int s) {
		int min = Integer.MAX_VALUE;
		int j = 0;
		int sum = 0;
        for (int i = 0; i < nums.length; i ++) {
        		while (j < nums.length) {
        			if (sum >= s) {
        				break;
        			}
        			sum += nums[j ++];
        		}
        		if (sum >= s) {
        			if (min > j - i) {
        				min = j - i;
        			}
        		}
			sum -= nums[i];
        }
        if (min == Integer.MAX_VALUE) {
        		return -1;
        }
		return min;
    }
}
