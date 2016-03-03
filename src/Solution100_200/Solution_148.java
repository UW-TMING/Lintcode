package Solution100_200;

public class Solution_148 {
	public void sortColors(int[] nums) {
        if (nums == null) return;
        int i = 0;
        int j = 0;
        int k = nums.length - 1;
        while (i <= k) {
        		if (nums[i] == 0) {
        			swap (nums, i, j);
        			i ++;
        			j ++;
        		} else if (nums[i] == 1){
        			i ++;
        		} else {
        			swap (nums, i, k);
        			k --;
        		}
        }
    }
	public void swap (int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = nums[i];
	}
}
