package Solution0_100;

public class Solution_60 {
	public static void main (String[] args) {
		Solution_60 test = new Solution_60 ();
		int[] A = {-1, 0, 1, 2};
		int target = 2;
		System.out.println (test.searchInsert(A, target));
	}
	public int searchInsert(int[] A, int target) {
		if (A == null || A.length == 0) return 0;
        if (A[0] >= target) return 0;
        if (target > A[A.length - 1]) return A.length;
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
        		int mid = (left + right) / 2;
        		if (A[mid] == target) return mid;
        		if (A[mid] > target) right = mid - 1;
        		if (A[mid] < target) left = mid + 1;
        }
        return left + 1;
    }
}
