package Solution0_100;

public class Solution_63 {
	public boolean search(int[] A, int target) {
        // write your code here
        if (A == null) return false;
        for (int i = 0; i < A.length; i ++) {
            if (A[i] == target) {
                return true;
            }
        }
        return false;
    }
}
