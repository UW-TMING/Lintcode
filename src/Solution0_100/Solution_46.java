package Solution0_100;

import java.util.ArrayList;

public class Solution_46 {
	public int majorityNumber(ArrayList<Integer> nums) {
		if (nums.size() <= 0) return Integer.MIN_VALUE;
        int count = 1;
        int ans = nums.get(0);
        for (int i = 1; i < nums.size(); i ++) {
        		int val = nums.get(i);
        		if (val == ans) {
        			count += 1;
        		} else {
        			count -= 1;
        		}
        		if (count == 0) {
        			ans = val;
        			count = 1;
        		}
        }
        return ans;
    }
}
