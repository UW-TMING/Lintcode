package Solution0_100;

public class Solution_14 {
	public int binarySearch(int[] nums, int target) {
        int ans = -1;
        if (nums == null || nums.length == 0) return ans;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
        		int mid = (left + right) / 2;
        		if (nums[mid] == target) {
        			ans = mid;
        			right = mid - 1;
        		}
        		if (nums[mid] < target) left = mid + 1;
        		if (nums[mid] > target) right = mid - 1;
        }
        return ans;
    }
}
