package Solution100_200;

public class Solution_190 {
	public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int index = -1;
        int len = nums.length;
        for(int i = len - 2; i >= 0; i --) {
        		if(nums[i] < nums[i + 1]) {
        			index = i;
        			break;
        		}
        }
        if(index == -1) {
        		reverse(nums, 0, len - 1);
        		return;
        }
        int firstBig = index + 1;
        for(int i = len - 1; i > index; i --) {
        		if(nums[i] > nums[index]) {
        			firstBig = i;
        			break;
        		}
        }
        swap(nums, index, firstBig);
        reverse(nums, index + 1, len - 1);
    }
	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public void reverse(int[] nums, int i, int j) {
		while(i < j) {
			swap(nums, i, j);
			i ++;
			j --;
		}
	}
}
