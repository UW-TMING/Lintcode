package Solution0_100;

public class Solution_83 {
	public int singleNumberII(int[] A) {
        if(A == null || A.length == 0) return Integer.MIN_VALUE;
        int[] a = new int[32];
        int ans = 0;
        for(int i = 0; i < 32; i ++) {
        		for(int j = 0; j < A.length; j ++) {
        			a[i] += A[j]>>i & 1;
        		}
        		ans |= (a[i] % 3) << i;
        }
        return ans;
    }
}
