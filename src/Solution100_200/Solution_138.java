package Solution100_200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Solution_138 {
	public ArrayList<Integer> subarraySum(int[] nums) {
		ArrayList<Integer> ans = new ArrayList<Integer> ();
        if (nums == null) {
        		return ans;
        }
        int sum = 0;
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer> ();
        table.put(0, -1);
        for (int i = 0; i < nums.length; i ++) {
        		sum += nums[i];
        		if (table.containsKey(sum)) {
        			ans.add(table.get(sum) + 1);
        			ans.add(i);
        			return ans;
        		}
        		table.put(sum, i);
        }
        return ans;
    }
}
