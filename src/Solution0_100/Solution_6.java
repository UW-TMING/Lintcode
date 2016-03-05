package Solution0_100;

public class Solution_6 {
	public int[] mergeSortedArray(int[] A, int[] B) {
        if (A == null) return B;
        if (B == null) return A;
        int[] ans = new int[A.length + B.length];
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < A.length && j < B.length) {
        		if (A[i] < B[j]) {
        			i ++;
        			ans[count ++] = A[i];
        		} else {
        			j ++;
        			ans[count ++] = B[j];
        		}
        }
        while (i < A.length) {
        		ans[count ++] = A[i ++];
        }
        while (j < B.length) {
    			ans[count ++] = B[j ++];
        }
        return ans;
    }
}
