package Solution0_100;

import java.util.ArrayList;
import java.util.List;

public class Solution_84 {
	
	public static void main (String[] args) {
		int[] A = {2, 2, 1, 1, 3, 7};
		Solution_84 test = new Solution_84 ();
		List<Integer> ans = test.singleNumberIII(A);
		for (int k : ans) {
			System.out.println (k);
		}
	}
	
	public List<Integer> singleNumberIII(int[] A) {
		List<Integer> ans = new ArrayList<Integer> ();
		if (A == null) return ans;
        int helper = 0;
        for (int i = 0; i < A.length; i ++) {
        		helper ^= A[i];
        }
        int ans1 = 0;
        int ans2 = 0;
        int temp = helper - (helper & (helper - 1));
        for (int i = 0; i < A.length; i ++) {
        		if ((temp & A[i]) == 0) {
        			ans1 ^= A[i];
        		} else {
        			ans2 ^= A[i];
        		}
        }
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}
