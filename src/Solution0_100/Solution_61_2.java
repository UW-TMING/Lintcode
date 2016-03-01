package Solution0_100;

public class Solution_61_2 {
	public int[] searchRange(int[] A, int target) {
		int[] ans = {-1, -1};
		if (A == null || A.length == 0) return ans;
		int left = 0;
		int right = A.length - 1;
		while (left + 1 < right) {
			int mid = (left + right) / 2;
			if (A[mid] == target) right = mid;
			if (A[mid] < target) left = mid + 1;
			if (A[mid] > target) right = mid - 1;
		}
		if (A[left] == target) {
			ans[0] = left;
		} else if (A[right] == target) {
			ans[0] = right;
		} else {
			return ans;
		}
		left = 0;
		right = A.length - 1;
		while (left + 1 < right) {
			int mid = (left + right) / 2;
			if (A[mid] == target) left = mid;
			if (A[mid] < target) left = mid + 1;
			if (A[mid] > target) right = mid - 1;
		}
		if (A[right] == target) {
			ans[1] = right;
		} else if (A[left] == target) {
			ans[1] = left;
		} else {
			return ans;
		}
		return ans;
	}
}
