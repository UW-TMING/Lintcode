package Solution0_100;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution_48 {
	public static void main (String[] args) {
	}
	public int majorityNumber(ArrayList<Integer> nums, int k) {
        if (nums == null) return Integer.MIN_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer> ();
        for (int i = 0; i < nums.size(); i ++) {
        		int val = nums.get(i);
        		if (hm.containsKey(val)) {
        			int count = hm.get(val);
        			hm.put(val, count + 1);
        		} else {
        			hm.put(val, 1);
        		}
        }
        return 0;
    }
}
