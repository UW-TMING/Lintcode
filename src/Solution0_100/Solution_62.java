package Solution0_100;

public class Solution_62 {
	public static void main (String[] args) {
		int[] A = {0,1,2,-10,-9,-8,-7,-6,-5,-4,-3,-2,-1};
		int target = -9;
		Solution_62 test = new Solution_62();
		System.out.println (test.search(A, target));
	}
	public int search(int[] A, int target) {
		if (A == null || A.length == 0) return -1;
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {

        		int mid = (left + right) / 2;
        		if (A[mid] == target) return mid;
        		if (A[left] <= A[mid]) {
        			if (A[left] <= target && target < A[mid]) {
        				right = mid - 1;
        			} else {
        				left = mid + 1;
        			}
        		} else {
        			if (target > A[mid] && target <= A[right]) {
        				left = mid + 1;
        			} else {
        				right = mid - 1;
        			}
        		}
        }
        return -1;
    }
}
