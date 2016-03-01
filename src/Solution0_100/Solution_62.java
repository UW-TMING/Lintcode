package Solution0_100;

public class Solution_62 {
	public int search(int[] A, int target) {
        if (A == null || A.length == 0) return -1;
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
        		int mid = (left + right) / 2;
        		if (A[mid] == target) return mid;
        		if (A[right] > A[left]) {
        			if (A[mid] > target) {
        				right = mid - 1;
        			} else {
        				left = mid + 1;
        			}
        		}
        		if (A[right] < A[left]) {
    				if (A[mid] >= A[left]) right = mid - 1;
    				if (A[mid] <= A[right]) left = mid + 1;
        		}
        }
        return -1;
    }
}
