package Solution100_200;

import java.util.Stack;

public class Solution_116 {
	public boolean canJump(int[] A) {
        if(A == null || A.length == 0) return false;
        int max = A[0];
        for (int i = 1; i < A.length - 1; i ++) {
        		int temp = i + A[i];
        		if (i <= max && temp > max) {
        			max = temp;
        		}
        }
        return max >= A.length - 1;
    }
}
