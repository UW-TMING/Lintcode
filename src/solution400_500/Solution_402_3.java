package solution400_500;

import java.util.ArrayList;

public class Solution_402_3 {
	public static void main (String[] args) {
		int[] A = {-101,-33,-44,-55,-67,-78,-101,-33,-44,-55,-67,-78,-100,-200,-1000,-22,-100,-200,-1000,-22};
		Solution_402_3 test = new Solution_402_3();
		ArrayList<Integer> ans = test.continuousSubarraySum(A);
		for (int k : ans) {
			System.out.println (k);
		}
	}
	
	
	public ArrayList<Integer> continuousSubarraySum(int[] A) {
        if (A == null || A.length == 0) return null;
        ArrayList<Integer> ans = new ArrayList<Integer> ();
        int start = 0;
        int end = 0;
        int sum = A[0];
        int max = A[0];
        ans.add(start);
        ans.add(start);
        for (int i = 1; i < A.length; i ++) {
        		if (sum > max) {
        			ans.set(0, start);
        			ans.set(1, i - 1);
        			max = sum;
        		}
        		if (sum < 0) {
        			start = i;
        			sum = 0;
        		}
        		sum += A[i];
        }
        if (sum > max) {
			ans.set(0, start);
			ans.set(1, A.length - 1);
		}
        return ans;
    }
}
