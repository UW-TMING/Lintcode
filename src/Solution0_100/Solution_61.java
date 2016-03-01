package Solution0_100;

public class Solution_61 {
	public int[] searchRange(int[] A, int target) {
        int[] ans = {-1, -1};
        if (A == null || A.length == 0) return ans;
        int left = 0;
        int right = A.length - 1;
        operator (A, target, ans, left, right);
        return ans;
    }
	public void operator (int[] A, int target, int[] ans, int left, int right) {
		if (left > right) return;
		while (left <= right) {
	    		int mid = (left + right) / 2;
	    		if (A[mid] == target) {
	    			if (mid + 1 == A.length - 1 || A[mid + 1] != target) ans[1] = mid;
	    			if (mid - 1 == -1 || A[mid - 1] != target) ans[1] = mid;
	    			operator (A, target, ans, left, mid - 1);
	    			operator (A, target, ans, mid + 1, right);
	    		}
	    		if (A[mid] < target) left = mid + 1;
	    		if (A[mid] > target) right = mid - 1;
		}
	}
}
