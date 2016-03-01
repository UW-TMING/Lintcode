package Solution0_100;

public class Solution_75 {
	public static void main (String[] args) {
		Solution_75 test = new Solution_75();
		int[] A = {1, 2, 1, 3, 4, 5, 7, 6};
		System.out.println (test.findPeak(A));
	}
	public int findPeak(int[] A) {
        if (A == null || A.length < 3) {
        		return -1;
        }
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
        		int mid = (start + end) / 2;
        		if (A[mid] > A[mid + 1] && A[mid] > A[mid - 1]) {
        			return mid;
        		} else if (A[mid] < A[mid + 1]) {
        			start = mid;
        		} else if (A[mid] < A[mid - 1]) {
        			end = mid;
        		}
        }
        return -1;
    }
}
