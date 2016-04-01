package Solution0_100;

public class Solution_52 {
	public int[] nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) return nums; 
        int len = nums.length;
        int index = -1;
        for (int i = len - 2; i >= 0; i --) {
        		if(nums[i] < nums[i + 1]) {
        			index = i;
        			break;
        		}
        }
        if(index == -1) {
        		reverse(nums, 0, len - 1);
        		return nums;
        }
        int biggerIndex = index + 1;
        for (int i = len - 1; i > index; i --) {
        		if(nums[i] > nums[index]) {
        			biggerIndex = i;
        			break;
        		}
        }
        swap(nums, index, biggerIndex);
        reverse(nums, index + 1, len - 1);
        return nums;
    }
	
	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public void reverse(int[] nums, int start, int end) {
		int i = start; 
		int j = end;
		while (i < j) {
			swap(nums, i, j);
			i ++;
			j --;
		}
	}
}
