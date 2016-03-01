package Solution0_100;

public class Solution_61_3 {
	public int[] searchRange(int[] A, int target) {
		int[] ans = {-1, -1};
		if (A == null || A.length == 0) return ans;
		int left = 0;
		int right = A.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (A[mid] == target) {
				ans[0] = mid;
				right = mid - 1;
			}
			if (A[mid] < target) left = mid + 1;
			if (A[mid] > target) right = mid - 1;
		}
		left = 0;
		right = A.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (A[mid] == target) {
				ans[1] = mid;
				left = mid + 1;
			}
			if (A[mid] < target) left = mid + 1;
			if (A[mid] > target) right = mid - 1;
		}
		return ans;
	}
}
